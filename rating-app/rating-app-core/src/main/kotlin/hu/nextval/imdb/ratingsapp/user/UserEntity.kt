package hu.nextval.imdb.ratingsapp.user

import javax.persistence.*

@Entity
data class UserEntity(
    var username: String,
    var password: String,
    var enabled: Boolean,
    @ElementCollection(fetch = FetchType.EAGER)
    var authorities: List<String>,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
)
