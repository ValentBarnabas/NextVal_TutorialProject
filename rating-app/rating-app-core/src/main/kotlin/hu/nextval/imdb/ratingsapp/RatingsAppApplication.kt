package hu.nextval.imdb.ratingsapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RatingsAppApplication

fun main(args: Array<String>) {
	runApplication<RatingsAppApplication>(*args)
}
