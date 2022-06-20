package hu.nextval.imdb.ratingsapp.rating;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lhu/nextval/imdb/ratingsapp/rating/RatingService;", "", "db", "Lhu/nextval/imdb/ratingsapp/rating/RatingRepository;", "(Lhu/nextval/imdb/ratingsapp/rating/RatingRepository;)V", "getDb", "()Lhu/nextval/imdb/ratingsapp/rating/RatingRepository;", "deleteRatingById", "", "id", "", "getRatingById", "Lhu/nextval/imdb/ratingsapp/rating/RatingEntity;", "getRatings", "", "getRatingsForMovieId", "movieId", "postRating", "ratingEntity", "updateRating", "rating-app-core"})
@org.springframework.stereotype.Service
public class RatingService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.rating.RatingRepository db = null;
    
    public RatingService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingRepository db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.rating.RatingRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> getRatings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public hu.nextval.imdb.ratingsapp.rating.RatingEntity getRatingById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.rating.RatingEntity postRating(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingEntity ratingEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.rating.RatingEntity updateRating(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingEntity ratingEntity) {
        return null;
    }
    
    public void deleteRatingById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> getRatingsForMovieId(long movieId) {
        return null;
    }
}