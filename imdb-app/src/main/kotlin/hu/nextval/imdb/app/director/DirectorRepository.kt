package hu.nextval.imdb.app.director

import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

interface DirectorRepository {
    fun findAll() : List<DirectorEntity>
    fun findById(id: Long) : Optional<DirectorEntity>
    fun save(directorEntity: DirectorEntity) : DirectorEntity
    fun delete(directorEntity: DirectorEntity)
    fun deleteById(id: Long)
    fun findByActorName(name: String): List<DirectorEntity>
}

@Primary
@Repository
interface JPADirectorRepository : DirectorRepository, JpaRepository<DirectorEntity, Long> {

    @Query("SELECT d from DirectorEntity d where UPPER(d.name) LIKE UPPER(:name)")
    fun findByName(@Param("name") name: String) : DirectorEntity

//    @Query("SELECT d from DirectorEntity d where d.moviesDirected.length() > 0")
//    fun hasDirectedMovies(): List<DirectorEntity>

//    find director based on his movies where said actor is acting
    @Query("select distinct d from DirectorEntity d join d.moviesDirected m join m.actors a where a.name = :actorName")
    override fun findByActorName(@Param("actorName") name: String) : List<DirectorEntity>

}

//@Repository
//class InMemoryDirectorRepository : DirectorRepository {
//
//    val directorEntityMutableList = mutableListOf<DirectorEntity>()
//
//    override fun findAll(): List<DirectorEntity> {
//        return directorEntityMutableList
//    }
//
//    override fun findById(id: Long): Optional<DirectorEntity> {
//        return Optional.of(directorEntityMutableList.firstOrNull {it.id == id} ?: throw NotFoundException())
//    }
//
//    override fun save(directorEntity: DirectorEntity): DirectorEntity {
//        directorEntityMutableList.removeIf { it.id == directorEntity.id }
//        directorEntityMutableList.add(directorEntity)
//        return directorEntity
//    }
//
//    override fun delete(directorEntity: DirectorEntity) {
//        directorEntityMutableList.remove(directorEntity)
//    }
//
//    override fun deleteById(id: Long) {
//        try {
//            directorEntityMutableList.removeIf {it.id == id}
//        } catch (e : java.lang.NullPointerException) {
//            throw NotFoundException()
//        } catch (e : Exception) {
//            throw e
//        }
//    }
//
//}