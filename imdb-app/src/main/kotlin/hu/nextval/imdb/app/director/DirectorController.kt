package hu.nextval.imdb.app.director

import hu.nextval.imdb.app.common.exceptions.BadRequestException
import hu.nextval.imdb.app.director.dto.DirectorCreateUpdateRequest
import hu.nextval.imdb.app.director.dto.DirectorMapper
import hu.nextval.imdb.app.director.dto.DirectorResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/director")
class DirectorController (val service: DirectorService, val mapper: DirectorMapper) {
    @GetMapping
    fun getAll(): List<DirectorResponse> {
        return service.getDirectors().map { mapper.mapFromEntityToResponse(it) }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id : Long) : DirectorResponse {
        val director = service.getDirectorById(id)
        if (!director.isPresent) throw BadRequestException()
        return mapper.mapFromEntityToResponse(director.get())
    }

    @GetMapping("/actor/{name}")
    fun findByActorName(@PathVariable name: String) : List<DirectorResponse> {
        val response = service.getDirectorByActorName(name)
        if (response.isEmpty()) {
            throw BadRequestException("Director did not direct movie with actor $name")
        }
        return response.map { mapper.mapFromEntityToResponse(it) } ;
    }

    @PostMapping
    fun post(@RequestBody directorRequest: DirectorCreateUpdateRequest) : DirectorResponse {
        if (directorRequest.id != null) throw BadRequestException()
        return mapper.mapFromEntityToResponse(service.postDirector((mapper.mapFromRequestToEntity(directorRequest))))
    }

    @PutMapping
    fun put(@RequestBody directorRequest: DirectorCreateUpdateRequest) : DirectorResponse {
        if (directorRequest.id == null) throw BadRequestException()
        return mapper.mapFromEntityToResponse(service.updateDirector(mapper.mapFromRequestToEntity(directorRequest)))
    }

//    @DeleteMapping
//    fun delete(@RequestBody directorRequest: DirectorCreateUpdateRequest) : DirectorResponse {
//        return mapper.mapFromEntityToResponse(service.deleteDirector(mapper.mapFromRequestToEntity(directorRequest)))
//    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.deleteDirectorById(id)
    }
}