package hu.nextval.imdb.app.academyofactors


import hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsCreateUpdateRequest
import hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsMapper
import hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse
import hu.nextval.imdb.app.common.exceptions.BadRequestException
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/academy-of-actors")
class AcademyOfActorsController (val service: AcademyOfActorsService, val mapper: AcademyOfActorsMapper) {

    @GetMapping
    fun getAll(): List<AcademyOfActorsResponse> {
        return service.getAcademies().map { mapper.mapFromEntityToResponse(it) }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) : AcademyOfActorsResponse {
        val academy = service.getAcademyById(id) ?: throw BadRequestException()
        return mapper.mapFromEntityToResponse(academy)
    }

    @PostMapping
    fun post(@RequestBody academyRequest : AcademyOfActorsCreateUpdateRequest) : AcademyOfActorsResponse {
        if (academyRequest.id != null) throw BadRequestException()
        return mapper.mapFromEntityToResponse(service.postAcademy(mapper.mapFromRequestToEntity(academyRequest)))
    }

    @PutMapping
    fun put(@RequestBody academyRequest: AcademyOfActorsCreateUpdateRequest) : AcademyOfActorsResponse {
        if (academyRequest.id == null) throw BadRequestException()
        return mapper.mapFromEntityToResponse(service.updateAcademy(mapper.mapFromRequestToEntity(academyRequest)))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : Long) {
        service.deleteAcademyById(id)
    }
}