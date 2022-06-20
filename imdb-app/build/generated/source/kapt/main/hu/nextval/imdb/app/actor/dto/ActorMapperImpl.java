package hu.nextval.imdb.app.actor.dto;

import hu.nextval.imdb.app.actor.ActorEntity;
import hu.nextval.imdb.app.membership.MembershipEntity;
import hu.nextval.imdb.app.membership.dto.MembershipResponse;
import hu.nextval.imdb.app.movie.MovieEntity;
import java.time.LocalDate;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-14T12:58:22+0200",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class ActorMapperImpl extends ActorMapper {

    @Override
    public ActorResponse mapFromEntityToMinimalResponse(ActorEntity actorEntity) {
        if ( actorEntity == null ) {
            return null;
        }

        List<String> actedInMovies = null;
        Long id = null;
        String name = null;
        LocalDate dateOfBirth = null;

        actedInMovies = ActorMapper.map( actorEntity.getActedInMovies() );
        id = actorEntity.getId();
        name = actorEntity.getName();
        dateOfBirth = actorEntity.getDateOfBirth();

        List<MembershipResponse> aoaRegistration = null;

        ActorResponse actorResponse = new ActorResponse( id, name, dateOfBirth, aoaRegistration, actedInMovies );

        return actorResponse;
    }

    @Override
    public ActorEntity mapFromRequestToMinimalEntity(ActorCreateUpdateRequest actorRequest) {
        if ( actorRequest == null ) {
            return null;
        }

        String name = null;
        int income = 0;
        LocalDate dateOfBirth = null;
        Long id = null;

        name = actorRequest.getName();
        income = actorRequest.getIncome();
        dateOfBirth = actorRequest.getDateOfBirth();
        id = actorRequest.getId();

        List<MembershipEntity> aoaRegistration = new java.util.ArrayList<>();
        List<MovieEntity> actedInMovies = new java.util.ArrayList<>();

        ActorEntity actorEntity = new ActorEntity( name, income, dateOfBirth, aoaRegistration, actedInMovies, id );

        return actorEntity;
    }
}
