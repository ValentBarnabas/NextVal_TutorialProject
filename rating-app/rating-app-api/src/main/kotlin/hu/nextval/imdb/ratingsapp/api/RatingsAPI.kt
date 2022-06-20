package hu.nextval.imdb.ratingsapp.api

import hu.nextval.imdb.ratingsapp.api.dto.RatingRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import hu.nextval.imdb.ratingsapp.api.dto.RatingResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*
import java.util.NoSuchElementException

//@Service
//class RatingsAPI {
//
//    val restTemplate = RestTemplate()
//
//    @Value("\${imdb.ratingservice.urlBase}")
//    lateinit var urlBase: String
//
//    val urlEnd = "rating/by-movie-id/"
//
//    fun getAllRatingsById(id: Long): List<Int> {
//        val response = restTemplate.getForObject(urlBase + urlEnd + id, Array<RatingResponse>::class.java)
//            ?: throw RuntimeException("Error retrieving ratings for movie with ID $id", NoSuchElementException())
//        return response.map { it.rating }
//    }
//
//}

@FeignClient(value = "RatingsAPI", url = "\${imdb.ratingservice.urlBase}/rating")
interface RatingsAPI {

    @GetMapping
    fun getAll() : List<RatingResponse>

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): RatingResponse

    @PostMapping
    fun post(@RequestBody ratingRequest: RatingRequest): RatingResponse

    @PutMapping
    fun put(@RequestBody ratingRequest: RatingRequest): RatingResponse

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long)


    @GetMapping("/by-movie-id/{id}")
    fun getAllRatingsById(@PathVariable("id") id: Long) : List<RatingResponse>
}
