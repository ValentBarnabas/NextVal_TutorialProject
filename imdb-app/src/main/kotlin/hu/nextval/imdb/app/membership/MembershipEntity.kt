package hu.nextval.imdb.app.membership


import hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity
import hu.nextval.imdb.app.actor.ActorEntity
import java.time.LocalDate
import javax.persistence.*

@Entity
data class MembershipEntity (
        @ManyToOne
        @JoinColumn(name="actorId")
        var actor: ActorEntity,
        @ManyToOne
        @JoinColumn(name="academyId")
        var academy: AcademyOfActorsEntity,

        var startOfMembership: LocalDate,
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "memGenerator")
        @SequenceGenerator(name = "memGenerator", sequenceName = "memSeq", allocationSize = 1)
        var id: Long? = null
)