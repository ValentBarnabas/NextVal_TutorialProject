package hu.nextval.imdb.app.movie.dto;

import hu.nextval.imdb.app.actor.ActorEntity;
import hu.nextval.imdb.app.director.DirectorEntity;
import hu.nextval.imdb.app.movie.MovieEntity;
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
public class MovieMapperImpl extends MovieMapper {

    @Override
    public MovieDetailedResponse mapFromEntityToDetailedResponse(MovieEntity movieEntity, List<Integer> ratings) {
        if ( movieEntity == null && ratings == null ) {
            return null;
        }

        String director = null;
        Long id = null;
        String title = null;
        String description = null;
        if ( movieEntity != null ) {
            director = MovieMapper.map( movieEntity.getDirector() );
            id = movieEntity.getId();
            title = movieEntity.getTitle();
            description = movieEntity.getDescription();
        }
        float rating = 0.0f;
        List<Integer> ratings1 = null;
        if ( ratings != null ) {
            rating = MovieMapper.map( ratings );
            List<Integer> list = ratings;
            if ( list != null ) {
                ratings1 = new ArrayList<Integer>( list );
            }
        }

        MovieDetailedResponse movieDetailedResponse = new MovieDetailedResponse( id, title, description, director, rating, ratings1 );

        return movieDetailedResponse;
    }

    @Override
    public MovieDetailedResponse mapFromEntityToDetailedResponse(MovieEntity movieEntity) {
        if ( movieEntity == null ) {
            return null;
        }

        String director = null;
        Long id = null;
        String title = null;
        String description = null;

        director = MovieMapper.map( movieEntity.getDirector() );
        id = movieEntity.getId();
        title = movieEntity.getTitle();
        description = movieEntity.getDescription();

        float rating = 0;
        List<Integer> ratings = new java.util.ArrayList<>();

        MovieDetailedResponse movieDetailedResponse = new MovieDetailedResponse( id, title, description, director, rating, ratings );

        return movieDetailedResponse;
    }

    @Override
    public MovieResponse mapFromEntityToResponse(MovieEntity movieEntity) {
        if ( movieEntity == null ) {
            return null;
        }

        long id = 0L;
        String title = null;

        if ( movieEntity.getId() != null ) {
            id = movieEntity.getId();
        }
        title = movieEntity.getTitle();

        MovieResponse movieResponse = new MovieResponse( id, title );

        return movieResponse;
    }

    @Override
    public MovieEntity mapFromRequestToMinimalEntity(MovieCreateUpdateRequest movieRequest) {
        if ( movieRequest == null ) {
            return null;
        }

        String title = null;
        String description = null;
        Long id = null;

        title = movieRequest.getTitle();
        description = movieRequest.getDescription();
        id = movieRequest.getId();

        List<ActorEntity> actors = new java.util.ArrayList<>();
        DirectorEntity director = null;

        MovieEntity movieEntity = new MovieEntity( title, description, director, actors, id );

        return movieEntity;
    }
}
