package hu.nextval.imdb.app.academyofactors

import org.springframework.stereotype.Service

@Service
class AcademyOfActorsService(val db: AcademyOfActorsRepository) {

    fun getAcademies(): List<AcademyOfActorsEntity> = db.findAll()

    fun getAcademyById(id: Long) : AcademyOfActorsEntity? = db.findById(id).orElse(null)

    fun postAcademy(academyOfActorsEntity: AcademyOfActorsEntity) = db.save(academyOfActorsEntity)

    fun updateAcademy(academyOfActorsEntity: AcademyOfActorsEntity) : AcademyOfActorsEntity {
        db.findById(academyOfActorsEntity.id!!)
        return db.save(academyOfActorsEntity)
    }

//    fun deleteAcademy(academyOfActorsEntity: AcademyOfActorsEntity) = db.delete(academyOfActorsEntity)

    fun deleteAcademyById(id: Long) = db.deleteById(id)
}
