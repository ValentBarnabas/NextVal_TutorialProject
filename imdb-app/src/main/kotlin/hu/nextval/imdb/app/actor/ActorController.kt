package hu.nextval.imdb.app.actor

import hu.nextval.imdb.app.actor.dto.ActorCreateUpdateRequest
import hu.nextval.imdb.app.actor.dto.ActorMapper
import hu.nextval.imdb.app.actor.dto.ActorResponse
import hu.nextval.imdb.app.common.exceptions.BadRequestException
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/actor")
class ActorController(val service: ActorService, val mapper : ActorMapper) {

    @GetMapping
    fun getAll(): List<ActorResponse> {
        return service.getActors().map { mapper.mapFromEntityToResponse(it) }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id : Long) : ActorResponse {
        val actor = service.getActorById(id)
        if (!actor.isPresent) throw BadRequestException("Actor is not found")
        return mapper.mapFromEntityToResponse(actor.get())
    }

    @PostMapping
    fun post(@RequestBody actorRequest: ActorCreateUpdateRequest) : ActorResponse {
        if (actorRequest.id != null) throw BadRequestException("Remove ID from POST request")
        return mapper.mapFromEntityToResponse(service.postActor(mapper.mapFromRequestToEntity(actorRequest)))
    }

    @PutMapping
    fun put(@RequestBody actorRequest: ActorCreateUpdateRequest) : ActorResponse {
        if (actorRequest.id == null) throw BadRequestException("Add ID to PUT request")
        return mapper.mapFromEntityToResponse(service.updateActor(mapper.mapFromRequestToEntity(actorRequest)))
    }

//    @DeleteMapping    //delete with json object
//    fun delete(@RequestBody actorRequest: ActorCreateUpdateRequest) : ActorResponse {
//        return mapper.mapFromEntityToResponse(service.deleteActor(mapper.mapFromRequestToEntity(actorRequest)))
//    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : Long) {
        service.deleteActorById(id)
    }

}