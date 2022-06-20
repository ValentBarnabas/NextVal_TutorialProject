package hu.nextval.imdb.app.actor

import hu.nextval.imdb.app.academyofactors.AcademyOfActorsService
import hu.nextval.imdb.app.common.exceptions.BadRequestException
import org.springframework.stereotype.Service
import java.util.*

@Service
class ActorService(val db: ActorRepository, val aoaService: AcademyOfActorsService) {

    fun getActors(): List<ActorEntity> = db.findAll()

    fun getActorById(id: Long) : Optional<ActorEntity> = db.findById(id)

    fun postActor(actorEntity: ActorEntity) = db.save(actorEntity)

    fun updateActor(actorEntity: ActorEntity) : ActorEntity {
        db.findById(actorEntity.id!!)
        return db.save(actorEntity)
    }

//    fun deleteActor(actorEntity: ActorEntity) = db.delete(actorEntity)

    fun deleteActorById(id: Long) {
        val actorEntity = getActorById(id).orElseThrow{ BadRequestException("No Actor exists with given ID: $id") }
        actorEntity.actedInMovies.onEach {
            it.actors.remove(actorEntity)
        }
        actorEntity.aoaRegistration?.onEach {
            //TODO: delete membership between AOA and Actor

        }
        db.deleteById(id)
    }
}
