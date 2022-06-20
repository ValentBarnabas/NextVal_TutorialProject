package hu.nextval.imdb.app.actor

import hu.nextval.imdb.app.common.exceptions.NotFoundException
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

//@Repository
//interface ActorRepository : CrudRepository<Actor, String> {
//
//    @Query("select * from actors")
//    fun findActors(): List<Actor>
//}

interface ActorRepository {
    fun findAll() : List<ActorEntity>
    fun findById(id: Long) : Optional<ActorEntity>
    fun save(actorEntity: ActorEntity) : ActorEntity
    fun delete(actorEntity: ActorEntity)
    fun deleteById(id: Long)
}

@Primary
@Repository
//Class with database access for CRUD operations
interface JPAActorRepository : ActorRepository, JpaRepository<ActorEntity, Long> /*entity and ID*/ {

}

@Repository
//class with mutablelist, use that for listing, saving, ... (crud)
class InMemoryActorRepository : ActorRepository {

    val actorEntityMutableList = mutableListOf<ActorEntity>()

    override fun findAll(): List<ActorEntity> {
        return actorEntityMutableList
    }

    override fun findById(id: Long): Optional<ActorEntity> {
        return Optional.of(actorEntityMutableList.firstOrNull {it.id == id} ?: throw NotFoundException())
    }

    override fun save(actorEntity: ActorEntity): ActorEntity {
        actorEntityMutableList.removeIf { it.id == actorEntity.id }
        actorEntityMutableList.add(actorEntity)
        return actorEntity
    }

    override fun delete(actorEntity: ActorEntity) {
        actorEntityMutableList.remove(actorEntity)
    }

    override fun deleteById(id: Long) {
        val toBeDeleted = actorEntityMutableList.firstOrNull {it.id == id} ?: throw NotFoundException()
        actorEntityMutableList.removeIf { it.id == id }
    }

}