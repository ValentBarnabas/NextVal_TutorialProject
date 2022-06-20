package hu.nextval.imdb.ratingsapp.rating;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lhu/nextval/imdb/ratingsapp/rating/InMemoryRepository;", "Lhu/nextval/imdb/ratingsapp/rating/RatingRepository;", "()V", "ratingEntityList", "", "Lhu/nextval/imdb/ratingsapp/rating/RatingEntity;", "getRatingEntityList", "()Ljava/util/List;", "delete", "", "ratingEntity", "deleteById", "id", "", "findAll", "", "findById", "findRatingsByMovieId", "movieId", "save", "rating-app-core"})
@org.springframework.stereotype.Repository
@org.springframework.context.annotation.Primary
public class InMemoryRepository implements hu.nextval.imdb.ratingsapp.rating.RatingRepository {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> ratingEntityList = null;
    
    public InMemoryRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> getRatingEntityList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public hu.nextval.imdb.ratingsapp.rating.RatingEntity findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<hu.nextval.imdb.ratingsapp.rating.RatingEntity> findRatingsByMovieId(long movieId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public hu.nextval.imdb.ratingsapp.rating.RatingEntity save(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingEntity ratingEntity) {
        return null;
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingEntity ratingEntity) {
    }
    
    @java.lang.Override
    public void deleteById(long id) {
    }
}