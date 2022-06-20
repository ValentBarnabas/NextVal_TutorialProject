package hu.nextval.imdb.app.director

import org.springframework.stereotype.Service
import java.util.*

@Service
class DirectorService(val db: DirectorRepository) {

    fun getDirectors(): List<DirectorEntity> = db.findAll()

    fun getDirectorById(id : Long): Optional<DirectorEntity> = db.findById(id)

    fun getDirectorByActorName(name: String): List<DirectorEntity> = db.findByActorName(name)

    fun postDirector(directorEntity: DirectorEntity) = db.save(directorEntity)

    fun updateDirector(directorEntity: DirectorEntity) : DirectorEntity {
        db.findById(directorEntity.id!!)
        return db.save((directorEntity))
    }

//    fun deleteDirector(directorEntity: DirectorEntity) = db.delete(directorEntity)

    fun deleteDirectorById(id: Long) = db.deleteById(id)
}