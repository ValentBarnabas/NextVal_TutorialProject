package hu.nextval.imdb.app.membership.dto


import hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity
import hu.nextval.imdb.app.actor.ActorEntity
import hu.nextval.imdb.app.membership.MembershipEntity
import org.mapstruct.Mapper;
import org.mapstruct.Mapping
import org.mapstruct.Named

@Mapper(componentModel = "spring")
interface MembershipMapper {
    @Mapping(source = "membershipEntity.actor", target = "actor", qualifiedByName = ["getActorName"])
    @Mapping(source = "membershipEntity.academy", target = "academy", qualifiedByName = ["getAOAName"])
    fun mapFromEntityToResponse(membershipEntity: MembershipEntity): MembershipResponse


    companion object {
        @JvmStatic
        @Named("getActorName")
        fun map(actor: ActorEntity) : String {
            return actor.name
        }

        @JvmStatic
        @Named("getAOAName")
        fun map(aoa: AcademyOfActorsEntity) : String {
            return aoa.name
        }
    }
}