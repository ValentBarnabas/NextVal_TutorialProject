package hu.nextval.imdb.app.academyofactors

import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

interface AcademyOfActorsRepository {
    fun findAll(): List<AcademyOfActorsEntity>
    fun findById(id: Long): Optional<AcademyOfActorsEntity>
    fun save(academyOfActorsEntity: AcademyOfActorsEntity) : AcademyOfActorsEntity
    fun delete(academyOfActorsEntity: AcademyOfActorsEntity)
    fun deleteById(id: Long)
}

@Primary
@Repository
interface JPAAcademyOfActorsRepository : AcademyOfActorsRepository, JpaRepository<AcademyOfActorsEntity, Long> {

}