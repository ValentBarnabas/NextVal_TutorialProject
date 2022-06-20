package hu.nextval.imdb.ratingsapp.rating

import org.springframework.context.annotation.Primary
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Repository

interface RatingRepository {
    fun findAll(): List<RatingEntity>
    fun findById(id: Long) : RatingEntity?
    fun findRatingsByMovieId(movieId: Long) : List<RatingEntity>
    fun save(ratingEntity: RatingEntity) : RatingEntity
    fun delete(ratingEntity: RatingEntity)
    fun deleteById(id: Long)
}

//@Repository
//interface JPARatingRepository : RatingRepository, JpaRepository<RatingEntity, Long> {
//
//}

@Primary
@Repository
class InMemoryRepository : RatingRepository {

    val ratingEntityList = mutableListOf<RatingEntity>(
        RatingEntity(1,3,1), RatingEntity(1,4,2),
            RatingEntity(1,5,3), RatingEntity(2,2,4)
    )


    override fun findAll(): List<RatingEntity> {
        return ratingEntityList
    }

    override fun findById(id: Long): RatingEntity? {
        return ratingEntityList.firstOrNull() { it.id == id } ?: throw Exception("rating with ID $id not found")
    }

    override fun findRatingsByMovieId(movieId: Long): List<RatingEntity> {
        return ratingEntityList.filter { it.movieId == movieId }
    }

    override fun save(ratingEntity: RatingEntity): RatingEntity {
        try {
            ratingEntityList.removeIf {it.id == ratingEntity.id}
            ratingEntityList.add(ratingEntity)
            return ratingEntity
        } catch (e: RuntimeException) {
            throw RuntimeException("couldn't save rating")
        }
    }

    override fun delete(ratingEntity: RatingEntity) {
        ratingEntityList.remove(ratingEntity)
    }

    override fun deleteById(id: Long) {
        ratingEntityList.firstOrNull() {it.id == id} ?: throw NotFoundException()
        ratingEntityList.removeIf { it.id == id }
    }

}