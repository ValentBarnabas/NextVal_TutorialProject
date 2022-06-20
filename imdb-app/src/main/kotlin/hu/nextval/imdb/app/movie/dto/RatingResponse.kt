package hu.nextval.imdb.app.movie.dto

data class RatingResponse (
        val id: Long,
        val movieId: Long,
        val rating: Int
)