package hu.nextval.imdb.app.actor.dto

import hu.nextval.imdb.app.actor.ActorEntity
import hu.nextval.imdb.app.actor.ActorService
import hu.nextval.imdb.app.membership.dto.MembershipMapper
import hu.nextval.imdb.app.membership.dto.MembershipResponse
import hu.nextval.imdb.app.movie.MovieEntity
import hu.nextval.imdb.app.movie.MovieService
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Named
import org.springframework.beans.factory.annotation.Autowired

@Mapper(componentModel = "spring")
abstract class ActorMapper {

    @Autowired
    lateinit var movieService: MovieService

    @Autowired
    lateinit var actorService: ActorService

    @Autowired
    lateinit var membershipMapper: MembershipMapper

    @Mapping(source = "actorEntity.actedInMovies", target = "actedInMovies", qualifiedByName = ["getMovies"])
    @Mapping(target = "aoaRegistration", ignore = true)
    abstract fun mapFromEntityToMinimalResponse(actorEntity: ActorEntity): ActorResponse

    fun mapFromEntityToResponse(actorEntity: ActorEntity) : ActorResponse {
        var result = mapFromEntityToMinimalResponse(actorEntity)
        val aoaList = mutableListOf<MembershipResponse>()
        actorEntity.aoaRegistration?.onEach {
            aoaList.add(membershipMapper.mapFromEntityToResponse(it))
        }
        result.aoaRegistration = aoaList
        return result
    }

    @Mapping(target = "actedInMovies", expression = "java(new java.util.ArrayList<>())")
    @Mapping(target = "aoaRegistration", expression = "java(new java.util.ArrayList<>())")
    abstract fun mapFromRequestToMinimalEntity(actorRequest: ActorCreateUpdateRequest): ActorEntity

    fun mapFromRequestToEntity(actorRequest: ActorCreateUpdateRequest): ActorEntity {
        val result = mapFromRequestToMinimalEntity(actorRequest)

        val pastMovieList = mutableListOf<MovieEntity>()
        lateinit var pastActor: ActorEntity
        if (actorRequest.id != null) {
            pastActor = actorService.getActorById(actorRequest.id).get()
            pastActor.actedInMovies.onEach { pastMovieList.add(it) }
        }

        val movieList = mutableListOf<MovieEntity>()
        for (id in actorRequest.actedInMovies) {
            movieList.add(movieService.getMovieById(id))
        }
        result.actedInMovies = movieList

        //adds actor to movies in which he hasn't acted before
        for (movie in movieList) {
            val ids = movie.actors.map { it.id }
            var inIt = false
            ids.onEach { if (it == result.id) inIt = true }
            if (!inIt) movie.actors.add(result)
        }
        //Removes actor from movies where he doesn't act
        for (movie in pastMovieList) {
            if (!movieList.contains(movie)) movie.actors.remove(pastActor)
        }
        return result
    }

    companion object {
        @JvmStatic
        @Named("getMovies")
        fun map(movies: List<MovieEntity>?): List<String> {
            return movies?.map { it.title }!!
        }
    }
}