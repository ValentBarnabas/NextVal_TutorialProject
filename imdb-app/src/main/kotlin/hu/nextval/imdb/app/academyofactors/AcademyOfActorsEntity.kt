package hu.nextval.imdb.app.academyofactors

import hu.nextval.imdb.app.membership.MembershipEntity
import javax.persistence.*

@Entity
data class AcademyOfActorsEntity (
        var name: String,
        @OneToMany(mappedBy = "academy", orphanRemoval = true)
        var registrations: List<MembershipEntity>? = null,
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aoaGenerator")
        @SequenceGenerator(name="oaoGenerator", sequenceName = "aoaSeq", allocationSize=1)
        var id: Long? = null
)