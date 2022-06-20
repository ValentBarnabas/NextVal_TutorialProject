package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lhu/nextval/imdb/app/movie/MovieService;", "", "db", "Lhu/nextval/imdb/app/movie/MovieRepository;", "(Lhu/nextval/imdb/app/movie/MovieRepository;)V", "getDb", "()Lhu/nextval/imdb/app/movie/MovieRepository;", "deleteMovieById", "", "id", "", "getMovieById", "Lhu/nextval/imdb/app/movie/MovieEntity;", "getMovies", "", "postMovie", "movieEntity", "updateMovie", "imdb-app"})
@org.springframework.stereotype.Service
public class MovieService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.movie.MovieRepository db = null;
    
    public MovieService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieRepository db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.MovieRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.movie.MovieEntity> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.MovieEntity getMovieById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.MovieEntity postMovie(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.MovieEntity updateMovie(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity) {
        return null;
    }
    
    public void deleteMovieById(long id) {
    }
}