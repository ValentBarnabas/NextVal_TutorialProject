package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J\u0012\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0017J\u0012\u0010\u001b\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lhu/nextval/imdb/app/movie/MovieController;", "", "service", "Lhu/nextval/imdb/app/movie/MovieService;", "mapper", "Lhu/nextval/imdb/app/movie/dto/MovieMapper;", "ratingsAPI", "Lhu/nextval/imdb/ratingsapp/api/RatingsAPI;", "(Lhu/nextval/imdb/app/movie/MovieService;Lhu/nextval/imdb/app/movie/dto/MovieMapper;Lhu/nextval/imdb/ratingsapp/api/RatingsAPI;)V", "getMapper", "()Lhu/nextval/imdb/app/movie/dto/MovieMapper;", "getRatingsAPI", "()Lhu/nextval/imdb/ratingsapp/api/RatingsAPI;", "getService", "()Lhu/nextval/imdb/app/movie/MovieService;", "delete", "", "id", "", "findById", "Lhu/nextval/imdb/app/movie/dto/MovieDetailedResponse;", "getAll", "", "Lhu/nextval/imdb/app/movie/dto/MovieResponse;", "post", "movieRequest", "Lhu/nextval/imdb/app/movie/dto/MovieCreateUpdateRequest;", "put", "imdb-app"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/movie"})
@org.springframework.web.bind.annotation.RestController
public class MovieController {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.movie.MovieService service = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.movie.dto.MovieMapper mapper = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.api.RatingsAPI ratingsAPI = null;
    
    public MovieController(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieService service, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.dto.MovieMapper mapper, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.api.RatingsAPI ratingsAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.MovieService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.movie.dto.MovieMapper getMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.api.RatingsAPI getRatingsAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<hu.nextval.imdb.app.movie.dto.MovieResponse> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public hu.nextval.imdb.app.movie.dto.MovieDetailedResponse findById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public hu.nextval.imdb.app.movie.dto.MovieDetailedResponse post(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.movie.dto.MovieCreateUpdateRequest movieRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping
    public hu.nextval.imdb.app.movie.dto.MovieDetailedResponse put(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.movie.dto.MovieCreateUpdateRequest movieRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void delete(@org.springframework.web.bind.annotation.PathVariable
    long id) {
    }
}