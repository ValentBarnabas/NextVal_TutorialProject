package hu.nextval.imdb.app.movie.dto

data class MovieDetailedResponse(
        val id: Long?,
        val title: String,
        val description: String?,
        val director: String,
        val rating : Float,
        val ratings: List<Int>
)
