package hu.nextval.imdb.app.director.dto;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lhu/nextval/imdb/app/director/dto/DirectorMapper;", "", "mapFromEntityToResponse", "Lhu/nextval/imdb/app/director/dto/DirectorResponse;", "directorEntity", "Lhu/nextval/imdb/app/director/DirectorEntity;", "mapFromRequestToEntity", "directorRequest", "Lhu/nextval/imdb/app/director/dto/DirectorCreateUpdateRequest;", "Companion", "imdb-app"})
public abstract interface DirectorMapper {
    @org.jetbrains.annotations.NotNull
    public static final hu.nextval.imdb.app.director.dto.DirectorMapper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(source = "directorEntity.moviesDirected", target = "moviesDirected", qualifiedByName = {"getTitle"})
    public abstract hu.nextval.imdb.app.director.dto.DirectorResponse mapFromEntityToResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorEntity directorEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.director.DirectorEntity mapFromRequestToEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.dto.DirectorCreateUpdateRequest directorRequest);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Named(value = "getTitle")
    @kotlin.jvm.JvmStatic
    public static java.lang.String map(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieEntity movie) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lhu/nextval/imdb/app/director/dto/DirectorMapper$Companion;", "", "()V", "map", "", "movie", "Lhu/nextval/imdb/app/movie/MovieEntity;", "imdb-app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @org.mapstruct.Named(value = "getTitle")
        @kotlin.jvm.JvmStatic
        public final java.lang.String map(@org.jetbrains.annotations.NotNull
        hu.nextval.imdb.app.movie.MovieEntity movie) {
            return null;
        }
    }
}