package hu.nextval.imdb.app.membership.dto;

import hu.nextval.imdb.app.membership.MembershipEntity;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T12:58:22+0200",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class MembershipMapperImpl implements MembershipMapper {

    @Override
    public MembershipResponse mapFromEntityToResponse(MembershipEntity membershipEntity) {
        if ( membershipEntity == null ) {
            return null;
        }

        String academy = null;
        String actor = null;
        LocalDate startOfMembership = null;
        long id = 0L;

        academy = MembershipMapper.map( membershipEntity.getAcademy() );
        actor = MembershipMapper.map( membershipEntity.getActor() );
        startOfMembership = membershipEntity.getStartOfMembership();
        if ( membershipEntity.getId() != null ) {
            id = membershipEntity.getId();
        }

        MembershipResponse membershipResponse = new MembershipResponse( actor, academy, startOfMembership, id );

        return membershipResponse;
    }
}
