package hu.nextval.imdb.app.membership.dto

import java.time.LocalDate

data class MembershipResponse (
        val actor : String,
        val academy : String,
        val startOfMembership: LocalDate,
        val id: Long
)