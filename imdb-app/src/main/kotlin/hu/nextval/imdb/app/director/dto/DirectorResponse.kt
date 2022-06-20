package hu.nextval.imdb.app.director.dto

import java.time.LocalDate

data class DirectorResponse (
        val id: Long?,
        val name: String,
        val dateOfBirth: LocalDate,
        val moviesDirected: List<String>?
)