package hu.nextval.imdb.app.academyofactors.dto

import hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AcademyOfActorsMapper {
    fun mapFromEntityToResponse(academyOfActorsEntity: AcademyOfActorsEntity): AcademyOfActorsResponse
    fun mapFromRequestToEntity(academyOfActorsRequest: AcademyOfActorsCreateUpdateRequest): AcademyOfActorsEntity
}