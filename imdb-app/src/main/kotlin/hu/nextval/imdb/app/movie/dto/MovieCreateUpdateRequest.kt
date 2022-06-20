package hu.nextval.imdb.app.movie.dto

data class MovieCreateUpdateRequest (
        val id: Long?,
        val title: String,
        val description: String?,
        val directorId: Long
)