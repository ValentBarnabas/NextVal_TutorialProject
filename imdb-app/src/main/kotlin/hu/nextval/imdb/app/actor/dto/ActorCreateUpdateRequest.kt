package hu.nextval.imdb.app.actor.dto

import java.time.LocalDate

data class ActorCreateUpdateRequest (
        val id: Long?,
        val name: String,
        val income: Int,
        val dateOfBirth: LocalDate,
        val actedInMovies: List<Long>
)
