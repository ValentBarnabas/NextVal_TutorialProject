package hu.nextval.imdb.app.director.dto

import hu.nextval.imdb.app.director.DirectorEntity
import hu.nextval.imdb.app.movie.MovieEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Named

@Mapper(componentModel="spring")
interface DirectorMapper {

    @Mapping(source="directorEntity.moviesDirected", target="moviesDirected", qualifiedByName= ["getTitle"])
    fun mapFromEntityToResponse (directorEntity: DirectorEntity) : DirectorResponse

    fun mapFromRequestToEntity (directorRequest : DirectorCreateUpdateRequest) : DirectorEntity

    companion object {
        @JvmStatic
        @Named("getTitle")
        fun map (movie : MovieEntity) : String {
            return movie.title
        }
    }
}