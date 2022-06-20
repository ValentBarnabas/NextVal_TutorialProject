package hu.nextval.imdb.ratingsapp.api.dto

data class RatingRequest (
        val id: Long?,
        val movieId: Long,
        val rating: Int
)