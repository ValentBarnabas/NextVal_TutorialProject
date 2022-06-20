package hu.nextval.imdb.app.director.dto;

import hu.nextval.imdb.app.director.DirectorEntity;
import hu.nextval.imdb.app.movie.MovieEntity;
import java.time.LocalDate;
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
public class DirectorMapperImpl implements DirectorMapper {

    @Override
    public DirectorResponse mapFromEntityToResponse(DirectorEntity directorEntity) {
        if ( directorEntity == null ) {
            return null;
        }

        List<String> moviesDirected = null;
        Long id = null;
        String name = null;
        LocalDate dateOfBirth = null;

        moviesDirected = movieEntityListToStringList( directorEntity.getMoviesDirected() );
        id = directorEntity.getId();
        name = directorEntity.getName();
        dateOfBirth = directorEntity.getDateOfBirth();

        DirectorResponse directorResponse = new DirectorResponse( id, name, dateOfBirth, moviesDirected );

        return directorResponse;
    }

    @Override
    public DirectorEntity mapFromRequestToEntity(DirectorCreateUpdateRequest directorRequest) {
        if ( directorRequest == null ) {
            return null;
        }

        String name = null;
        LocalDate dateOfBirth = null;
        Long id = null;

        name = directorRequest.getName();
        dateOfBirth = directorRequest.getDateOfBirth();
        id = directorRequest.getId();

        List<MovieEntity> moviesDirected = null;

        DirectorEntity directorEntity = new DirectorEntity( name, dateOfBirth, moviesDirected, id );

        return directorEntity;
    }

    protected List<String> movieEntityListToStringList(List<MovieEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<String> list1 = new ArrayList<String>( list.size() );
        for ( MovieEntity movieEntity : list ) {
            list1.add( DirectorMapper.map( movieEntity ) );
        }

        return list1;
    }
}
