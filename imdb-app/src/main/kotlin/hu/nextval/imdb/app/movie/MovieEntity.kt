package hu.nextval.imdb.app.movie

import hu.nextval.imdb.app.actor.ActorEntity
import hu.nextval.imdb.app.director.DirectorEntity
import javax.persistence.*

@Entity
data class MovieEntity(
        var title: String,
        var description: String?,
        @ManyToOne(fetch = FetchType.LAZY)
        var director: DirectorEntity?,
        @ManyToMany
        @JoinTable(
                name = "actors_in_movie",
                joinColumns = [JoinColumn(name = "actor_id")],
                inverseJoinColumns = [JoinColumn(name = "movie_id")]
        )
        var actors: MutableList<ActorEntity>,
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movieGenerator")
        @SequenceGenerator(name="movieGenerator", sequenceName = "movSeq", allocationSize=1)
        var id: Long? = null
)