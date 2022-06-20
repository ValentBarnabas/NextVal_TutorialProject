package hu.nextval.imdb.ratingsapp.rating.dto;

import hu.nextval.imdb.ratingsapp.api.dto.RatingRequest;
import hu.nextval.imdb.ratingsapp.api.dto.RatingResponse;
import hu.nextval.imdb.ratingsapp.rating.RatingEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-15T14:08:36+0200",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public RatingResponse mapFromEntityToResponse(RatingEntity ratingEntity) {
        if ( ratingEntity == null ) {
            return null;
        }

        Long id = null;
        long movieId = 0L;
        int rating = 0;

        id = ratingEntity.getId();
        movieId = ratingEntity.getMovieId();
        rating = ratingEntity.getRating();

        RatingResponse ratingResponse = new RatingResponse( id, movieId, rating );

        return ratingResponse;
    }

    @Override
    public RatingEntity mapFromRequestToEntity(RatingRequest ratingRequest) {
        if ( ratingRequest == null ) {
            return null;
        }

        long movieId = 0L;
        int rating = 0;
        long id = 0L;

        movieId = ratingRequest.getMovieId();
        rating = ratingRequest.getRating();
        if ( ratingRequest.getId() != null ) {
            id = ratingRequest.getId();
        }

        RatingEntity ratingEntity = new RatingEntity( movieId, rating, id );

        return ratingEntity;
    }
}
