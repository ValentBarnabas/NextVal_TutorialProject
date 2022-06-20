package hu.nextval.imdb.app.director.dto

import java.time.LocalDate

data class DirectorCreateUpdateRequest (
            val id: Long?,
            val name: String,
            val dateOfBirth: LocalDate
    )