package hu.nextval.imdb.app.movie

import hu.nextval.imdb.app.common.exceptions.BadRequestException
import hu.nextval.imdb.app.movie.dto.MovieCreateUpdateRequest
import hu.nextval.imdb.app.movie.dto.MovieDetailedResponse
import hu.nextval.imdb.app.movie.dto.MovieMapper
import hu.nextval.imdb.app.movie.dto.MovieResponse
import hu.nextval.imdb.ratingsapp.api.RatingsAPI
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movie")
class MovieController(val service: MovieService, val mapper: MovieMapper, val ratingsAPI: RatingsAPI) {

    @GetMapping
    fun getAll(): List<MovieResponse> {
        return service.getMovies().map { mapper.mapFromEntityToResponse(it) }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): MovieDetailedResponse {
        val movie = service.getMovieById(id)
        val ratings = ratingsAPI.getAllRatingsById(id).map { it.rating }
        return mapper.mapFromEntityToDetailedResponse(movie, ratings)
    }

//    @GetMapping("/rating/{id}")
//    fun findRatingById(@PathVariable id : Long): String {
//        val uri = "http://localhost:8082/rating/$id"
//        val restTemplate = RestTemplate()
//        return restTemplate.getForObject(uri, String::class.java) ?: "Not found"
//    }

    @PostMapping
    fun post(@RequestBody movieRequest: MovieCreateUpdateRequest): MovieDetailedResponse {
        if (movieRequest.id != null) throw BadRequestException()
        return mapper.mapFromEntityToDetailedResponse(service.postMovie(mapper.mapFromRequestToEntity(movieRequest)))
    }

    @PutMapping
    fun put(@RequestBody movieRequest: MovieCreateUpdateRequest): MovieDetailedResponse {
        if (movieRequest.id == null) throw BadRequestException()
        val ratings = ratingsAPI.getAllRatingsById(movieRequest.id).map { it.rating }
        return mapper.mapFromEntityToDetailedResponse(service.updateMovie(mapper.mapFromRequestToEntity(movieRequest)), ratings)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.deleteMovieById(id)
    }
}