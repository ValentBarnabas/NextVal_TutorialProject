package hu.nextval.imdb.app.movie.dto

import hu.nextval.imdb.app.common.exceptions.BadRequestException
import hu.nextval.imdb.app.director.DirectorEntity
import hu.nextval.imdb.app.director.DirectorService
import hu.nextval.imdb.app.movie.MovieEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Named
import org.springframework.beans.factory.annotation.Autowired

@Mapper(componentModel = "spring")
abstract class MovieMapper {

    @Autowired
    lateinit var directorService: DirectorService

    @Mapping(source = "movieEntity.director", target = "director", qualifiedByName = ["getDirector"])
    @Mapping(target = "ratings", source = "ratings")
    @Mapping(target = "rating", source="ratings", qualifiedByName = ["averageRating"])
    abstract fun mapFromEntityToDetailedResponse(movieEntity: MovieEntity, ratings: List<Int>): MovieDetailedResponse

    @Mapping(source = "movieEntity.director", target = "director", qualifiedByName = ["getDirector"])
    @Mapping(target = "ratings", expression = "java(new java.util.ArrayList<>())")
    @Mapping(target = "rating", constant = "0")
    abstract fun mapFromEntityToDetailedResponse(movieEntity: MovieEntity): MovieDetailedResponse

    abstract fun mapFromEntityToResponse(movieEntity: MovieEntity): MovieResponse

    @Mapping(target = "director", ignore = true)
    @Mapping(target = "actors", expression = "java(new java.util.ArrayList<>())")
    abstract fun mapFromRequestToMinimalEntity(movieRequest: MovieCreateUpdateRequest): MovieEntity

    fun mapFromRequestToEntity(movieRequest: MovieCreateUpdateRequest): MovieEntity {
        val result = mapFromRequestToMinimalEntity(movieRequest)
        result.director = directorService.getDirectorById(movieRequest.directorId)
                .orElseThrow { BadRequestException("No director found with given ID: ${movieRequest.directorId}") }
        return result
    }

    companion object {

        @JvmStatic
        @Named("getDirector")
        fun map(director: DirectorEntity?): String {
            return director?.name ?: ""
        }

        @JvmStatic
        @Named("averageRating")
        fun map(ratings: List<Int>) : Float {
            return if (ratings.isNotEmpty()) ratings.average().toFloat() else 0.toFloat()
        }
    }
}