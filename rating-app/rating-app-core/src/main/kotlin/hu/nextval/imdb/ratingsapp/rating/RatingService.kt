package hu.nextval.imdb.ratingsapp.rating

import org.springframework.stereotype.Service

@Service
class RatingService (val db : RatingRepository){

    fun getRatings() : List<RatingEntity> = db.findAll()

    fun getRatingById(id: Long) : RatingEntity? = db.findById(id)

    fun postRating(ratingEntity: RatingEntity) = db.save(ratingEntity)

    fun updateRating(ratingEntity: RatingEntity) : RatingEntity {
//        db.findById(ratingEntity.id!!)
        return db.save(ratingEntity)
    }

    fun deleteRatingById(id: Long) {
        val ratingEntity = getRatingById(id) ?: throw Exception("Bad request, couldnt find rating with id $id")
        db.deleteById(id)
    }

    fun getRatingsForMovieId(movieId: Long): List<RatingEntity> {
        return db.findRatingsByMovieId(movieId)
    }

}