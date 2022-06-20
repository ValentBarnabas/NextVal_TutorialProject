package hu.nextval.imdb.ratingsapp.rating

import hu.nextval.imdb.ratingsapp.api.RatingsAPI
import hu.nextval.imdb.ratingsapp.api.dto.RatingRequest
import hu.nextval.imdb.ratingsapp.api.dto.RatingResponse
import hu.nextval.imdb.ratingsapp.rating.dto.RatingMapper
import org.springframework.security.access.annotation.Secured
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rating")
class RatingController(val service: RatingService, val mapper: RatingMapper) : RatingsAPI {

    @PreAuthorize("permitAll()")
    override fun getAll(): List<RatingResponse> {
        return service.getRatings().map { mapper.mapFromEntityToResponse(it) }
    }

    @PreAuthorize("permitAll()")
    override fun findById(@PathVariable id: Long): RatingResponse {
        val response = service.getRatingById(id) ?: throw RuntimeException("rating not found with id $id")
        return mapper.mapFromEntityToResponse(response)
    }

//    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PreAuthorize("hasAuthority('POST')")
    override fun post(@RequestBody ratingRequest: RatingRequest): RatingResponse {
//        if (ratingRequest.id != null) throw RuntimeException("ID must be null when inserting new item")
        return mapper.mapFromEntityToResponse(service.postRating(mapper.mapFromRequestToEntity(ratingRequest)))
    }

//    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PreAuthorize("hasAuthority('UPDATE')")
    override fun put(@RequestBody ratingRequest: RatingRequest): RatingResponse {
//        if (ratingRequest.id == null) throw RuntimeException("ID must be given when updating item")
        return mapper.mapFromEntityToResponse(service.updateRating(mapper.mapFromRequestToEntity(ratingRequest)))
    }

//    @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAuthority('DELETE')")
    override fun deleteById(@PathVariable id: Long) {
        service.deleteRatingById(id)
    }

    @PreAuthorize("permitAll()")
    override fun getAllRatingsById(id: Long): List<RatingResponse> {
        return service.getRatingsForMovieId(id).map { mapper.mapFromEntityToResponse(it) }
    }

}