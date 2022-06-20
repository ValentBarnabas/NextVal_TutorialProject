package hu.nextval.imdb.ratingsapp.api.dto

data class RatingResponse(
        val id: Long?,
        val movieId: Long,
        val rating: Int
)