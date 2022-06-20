package hu.nextval.imdb.app.movie

import hu.nextval.imdb.app.common.exceptions.BadRequestException
import org.springframework.stereotype.Service

@Service
class MovieService(val db : MovieRepository) {
    fun getMovies() : List<MovieEntity> = db.findAll()

    fun getMovieById(id: Long) : MovieEntity {
        val movie = db.findById(id)
        if (movie.isPresent) return movie.get()
        throw BadRequestException("Movie with given id does not exist $id")
    }

    fun postMovie(movieEntity: MovieEntity) = db.save(movieEntity)

    fun updateMovie(movieEntity: MovieEntity) : MovieEntity {
        db.findById(movieEntity.id!!)
        return db.save(movieEntity)
    }

//    fun deleteMovie(movieEntity: MovieEntity) = db.delete(movieEntity)

    fun deleteMovieById(id: Long) = db.deleteById(id)
}