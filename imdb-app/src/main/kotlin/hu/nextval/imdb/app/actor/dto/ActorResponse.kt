package hu.nextval.imdb.app.actor.dto

import hu.nextval.imdb.app.membership.dto.MembershipResponse
import java.time.LocalDate

data class ActorResponse(
        val id: Long?,
        val name: String,
        val dateOfBirth: LocalDate,
        var aoaRegistration: List<MembershipResponse>? = null,
        val actedInMovies: List<String>
)