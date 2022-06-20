package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lhu/nextval/imdb/app/movie/InMemoryMovieRepository;", "Lhu/nextval/imdb/app/movie/MovieRepository;", "()V", "movieEntityMutableList", "", "Lhu/nextval/imdb/app/movie/MovieEntity;", "getMovieEntityMutableList", "()Ljava/util/List;", "delete", "", "movieEntity", "deleteById", "id", "", "findAll", "", "findById", "Ljava/util/Optional;", "save", "imdb-app"})
@org.springframework.stereotype.Repository
public class InMemoryMovieRepository implements hu.nextval.imdb.app.movie.MovieRepository {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<hu.nextval.imdb.app.movie.MovieEntity> movieEntityMutableList = null;
    
    public InMemoryMovieRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.movie.MovieEntity> getMovieEntityMutableList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<hu.nextval.imdb.app.movie.MovieEntity> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Optional<hu.nextval.imdb.app.movie.MovieEntity> findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public hu.nextval.imdb.app.movie.MovieEntity save(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity) {
        return null;
    }
    
    @java.lang.Override
    public void delete(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity) {
    }
    
    @java.lang.Override
    public void deleteById(long id) {
    }
}