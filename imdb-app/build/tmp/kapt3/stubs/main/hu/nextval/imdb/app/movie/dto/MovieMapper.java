package hu.nextval.imdb.app.movie.dto;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\'R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lhu/nextval/imdb/app/movie/dto/MovieMapper;", "", "()V", "directorService", "Lhu/nextval/imdb/app/director/DirectorService;", "getDirectorService", "()Lhu/nextval/imdb/app/director/DirectorService;", "setDirectorService", "(Lhu/nextval/imdb/app/director/DirectorService;)V", "mapFromEntityToDetailedResponse", "Lhu/nextval/imdb/app/movie/dto/MovieDetailedResponse;", "movieEntity", "Lhu/nextval/imdb/app/movie/MovieEntity;", "ratings", "", "", "mapFromEntityToResponse", "Lhu/nextval/imdb/app/movie/dto/MovieResponse;", "mapFromRequestToEntity", "movieRequest", "Lhu/nextval/imdb/app/movie/dto/MovieCreateUpdateRequest;", "mapFromRequestToMinimalEntity", "Companion", "imdb-app"})
public abstract class MovieMapper {
    @org.springframework.beans.factory.annotation.Autowired
    public hu.nextval.imdb.app.director.DirectorService directorService;
    @org.jetbrains.annotations.NotNull
    public static final hu.nextval.imdb.app.movie.dto.MovieMapper.Companion Companion = null;
    
    public MovieMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.director.DirectorService getDirectorService() {
        return null;
    }
    
    public final void setDirectorService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "rating", source = "ratings", qualifiedByName = {"averageRating"})
    @org.mapstruct.Mapping(target = "ratings", source = "ratings")
    @org.mapstruct.Mapping(source = "movieEntity.director", target = "director", qualifiedByName = {"getDirector"})
    public abstract hu.nextval.imdb.app.movie.dto.MovieDetailedResponse mapFromEntityToDetailedResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> ratings);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "rating", constant = "0")
    @org.mapstruct.Mapping(target = "ratings", expression = "java(new java.util.ArrayList<>())")
    @org.mapstruct.Mapping(source = "movieEntity.director", target = "director", qualifiedByName = {"getDirector"})
    public abstract hu.nextval.imdb.app.movie.dto.MovieDetailedResponse mapFromEntityToDetailedResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.movie.dto.MovieResponse mapFromEntityToResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movieEntity);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "actors", expression = "java(new java.util.ArrayList<>())")
    @org.mapstruct.Mapping(target = "director", ignore = true)
    public abstract hu.nextval.imdb.app.movie.MovieEntity mapFromRequestToMinimalEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.dto.MovieCreateUpdateRequest movieRequest);
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.movie.MovieEntity mapFromRequestToEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.dto.MovieCreateUpdateRequest movieRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Named(value = "getDirector")
    @kotlin.jvm.JvmStatic
    public static final java.lang.String map(@org.jetbrains.annotations.Nullable
    hu.nextval.imdb.app.director.DirectorEntity director) {
        return null;
    }
    
    @org.mapstruct.Named(value = "averageRating")
    @kotlin.jvm.JvmStatic
    public static final float map(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> ratings) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\u0003\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007\u00a8\u0006\u000b"}, d2 = {"Lhu/nextval/imdb/app/movie/dto/MovieMapper$Companion;", "", "()V", "map", "", "director", "Lhu/nextval/imdb/app/director/DirectorEntity;", "", "ratings", "", "", "imdb-app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @org.mapstruct.Named(value = "getDirector")
        @kotlin.jvm.JvmStatic
        public final java.lang.String map(@org.jetbrains.annotations.Nullable
        hu.nextval.imdb.app.director.DirectorEntity director) {
            return null;
        }
        
        @org.mapstruct.Named(value = "averageRating")
        @kotlin.jvm.JvmStatic
        public final float map(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> ratings) {
            return 0.0F;
        }
    }
}