package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lhu/nextval/imdb/app/movie/MovieRepository;", "", "delete", "", "movieEntity", "Lhu/nextval/imdb/app/movie/MovieEntity;", "deleteById", "id", "", "findAll", "", "findById", "Ljava/util/Optional;", "save", "imdb-app"})
@org.springframework.stereotype.Repository
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<hu.nextval.imdb.app.movie.MovieEntity> findAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<hu.nextval.imdb.app.movie.MovieEntity> findById(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.movie.MovieEntity save(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity);
    
    public abstract void deleteById(long id);
}