package hu.nextval.imdb.app.actor

import hu.nextval.imdb.app.membership.MembershipEntity
import hu.nextval.imdb.app.movie.MovieEntity
import java.time.LocalDate
import javax.persistence.*

@Entity
data class ActorEntity (
        var name: String,
        var income: Int,
        var dateOfBirth: LocalDate,
        @OneToMany(mappedBy = "actor", orphanRemoval = true)
        var aoaRegistration: List<MembershipEntity>?,
        @ManyToMany(mappedBy = "actors")
        var actedInMovies: List<MovieEntity> = mutableListOf(),
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actorGenerator")
        @SequenceGenerator(name="actorGenerator", sequenceName = "actorSeq", allocationSize = 1)
        var id: Long? = null
)