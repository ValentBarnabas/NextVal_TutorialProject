package hu.nextval.imdb.app.director

import hu.nextval.imdb.app.movie.MovieEntity
import java.time.LocalDate
import javax.persistence.*

@Entity
data class DirectorEntity(
        var name: String,
        var dateOfBirth: LocalDate,
        @OneToMany(mappedBy = "director", cascade = [CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH], orphanRemoval = true)
        var moviesDirected: List<MovieEntity>? = null,
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "directorGenerator")
        @SequenceGenerator(name="directorGenerator", sequenceName = "dirSeq", allocationSize=1)
        var id: Long? = null
)
