package hu.nextval.imdb.app.academyofactors.dto;

import hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity;
import hu.nextval.imdb.app.membership.MembershipEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T12:58:22+0200",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class AcademyOfActorsMapperImpl implements AcademyOfActorsMapper {

    @Override
    public AcademyOfActorsResponse mapFromEntityToResponse(AcademyOfActorsEntity academyOfActorsEntity) {
        if ( academyOfActorsEntity == null ) {
            return null;
        }

        List<MembershipEntity> registrations = null;
        Long id = null;
        String name = null;

        List<MembershipEntity> list = academyOfActorsEntity.getRegistrations();
        if ( list != null ) {
            registrations = new ArrayList<MembershipEntity>( list );
        }
        id = academyOfActorsEntity.getId();
        name = academyOfActorsEntity.getName();

        AcademyOfActorsResponse academyOfActorsResponse = new AcademyOfActorsResponse( id, name, registrations );

        return academyOfActorsResponse;
    }

    @Override
    public AcademyOfActorsEntity mapFromRequestToEntity(AcademyOfActorsCreateUpdateRequest academyOfActorsRequest) {
        if ( academyOfActorsRequest == null ) {
            return null;
        }

        String name = null;
        List<MembershipEntity> registrations = null;
        Long id = null;

        name = academyOfActorsRequest.getName();
        List<MembershipEntity> list = academyOfActorsRequest.getRegistrations();
        if ( list != null ) {
            registrations = new ArrayList<MembershipEntity>( list );
        }
        id = academyOfActorsRequest.getId();

        AcademyOfActorsEntity academyOfActorsEntity = new AcademyOfActorsEntity( name, registrations, id );

        return academyOfActorsEntity;
    }
}
