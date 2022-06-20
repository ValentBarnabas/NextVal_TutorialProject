package hu.nextval.imdb.app.academyofactors.dto

import hu.nextval.imdb.app.membership.MembershipEntity


data class AcademyOfActorsResponse(
        val id: Long?,
        val name: String,
        val registrations: List<MembershipEntity>? = null
)