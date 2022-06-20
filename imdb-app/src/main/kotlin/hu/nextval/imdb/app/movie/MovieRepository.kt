package hu.nextval.imdb.app.movie

import hu.nextval.imdb.app.common.exceptions.NotFoundException
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

//
//import demo.model.Movie


//@Repository
//interface MovieRepository : CrudRepository<Movie, String> {
//
//    @Query("select * from movies")
//    fun findMovies(): List<Movie>
//}

@Repository
interface MovieRepository {
    fun findAll(): List<MovieEntity>
    fun findById(id: Long) : Optional<MovieEntity>
    fun save(movieEntity: MovieEntity) : MovieEntity
    fun delete(movieEntity: MovieEntity)
    fun deleteById(id: Long)
}

@Primary
@Repository
interface JPAMovieRepository : MovieRepository, JpaRepository<MovieEntity, Long> {

}

@Repository
class InMemoryMovieRepository : MovieRepository {

    val movieEntityMutableList = mutableListOf<MovieEntity>()

    override fun findAll(): List<MovieEntity> {
        return movieEntityMutableList
    }

    override fun findById(id: Long): Optional<MovieEntity> {
        return Optional.of(movieEntityMutableList.firstOrNull{it.id == id} ?: throw NotFoundException())
    }

    override fun save(movieEntity: MovieEntity): MovieEntity {
        movieEntityMutableList.removeIf { it.id == movieEntity.id }
        movieEntityMutableList.add(movieEntity)
        return movieEntity
    }

    override fun delete(movieEntity: MovieEntity) {
        movieEntityMutableList.remove(movieEntity)
    }

    override fun deleteById(id: Long) {
        movieEntityMutableList.removeIf { it.id == id }
    }

}