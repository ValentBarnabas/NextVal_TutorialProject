package hu.nextval.imdb.ratingsapp.rating.dto

import org.mapstruct.Mapper
import hu.nextval.imdb.ratingsapp.rating.RatingEntity
import hu.nextval.imdb.ratingsapp.api.dto.RatingRequest
import hu.nextval.imdb.ratingsapp.api.dto.RatingResponse

@Mapper(componentModel = "spring")
interface RatingMapper {
    fun mapFromEntityToResponse(ratingEntity: RatingEntity) : RatingResponse
    fun mapFromRequestToEntity(ratingRequest: RatingRequest) : RatingEntity
}