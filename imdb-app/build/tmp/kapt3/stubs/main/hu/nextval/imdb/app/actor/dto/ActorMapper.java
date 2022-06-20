package hu.nextval.imdb.app.actor.dto;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\'J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\'R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lhu/nextval/imdb/app/actor/dto/ActorMapper;", "", "()V", "actorService", "Lhu/nextval/imdb/app/actor/ActorService;", "getActorService", "()Lhu/nextval/imdb/app/actor/ActorService;", "setActorService", "(Lhu/nextval/imdb/app/actor/ActorService;)V", "membershipMapper", "Lhu/nextval/imdb/app/membership/dto/MembershipMapper;", "getMembershipMapper", "()Lhu/nextval/imdb/app/membership/dto/MembershipMapper;", "setMembershipMapper", "(Lhu/nextval/imdb/app/membership/dto/MembershipMapper;)V", "movieService", "Lhu/nextval/imdb/app/movie/MovieService;", "getMovieService", "()Lhu/nextval/imdb/app/movie/MovieService;", "setMovieService", "(Lhu/nextval/imdb/app/movie/MovieService;)V", "mapFromEntityToMinimalResponse", "Lhu/nextval/imdb/app/actor/dto/ActorResponse;", "actorEntity", "Lhu/nextval/imdb/app/actor/ActorEntity;", "mapFromEntityToResponse", "mapFromRequestToEntity", "actorRequest", "Lhu/nextval/imdb/app/actor/dto/ActorCreateUpdateRequest;", "mapFromRequestToMinimalEntity", "Companion", "imdb-app"})
public abstract class ActorMapper {
    @org.springframework.beans.factory.annotation.Autowired
    public hu.nextval.imdb.app.movie.MovieService movieService;
    @org.springframework.beans.factory.annotation.Autowired
    public hu.nextval.imdb.app.actor.ActorService actorService;
    @org.springframework.beans.factory.annotation.Autowired
    public hu.nextval.imdb.app.membership.dto.MembershipMapper membershipMapper;
    @org.jetbrains.annotations.NotNull
    public static final hu.nextval.imdb.app.actor.dto.ActorMapper.Companion Companion = null;
    
    public ActorMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.movie.MovieService getMovieService() {
        return null;
    }
    
    public final void setMovieService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.movie.MovieService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.ActorService getActorService() {
        return null;
    }
    
    public final void setActorService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.membership.dto.MembershipMapper getMembershipMapper() {
        return null;
    }
    
    public final void setMembershipMapper(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.membership.dto.MembershipMapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "aoaRegistration", ignore = true)
    @org.mapstruct.Mapping(source = "actorEntity.actedInMovies", target = "actedInMovies", qualifiedByName = {"getMovies"})
    public abstract hu.nextval.imdb.app.actor.dto.ActorResponse mapFromEntityToMinimalResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actorEntity);
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.dto.ActorResponse mapFromEntityToResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actorEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(target = "aoaRegistration", expression = "java(new java.util.ArrayList<>())")
    @org.mapstruct.Mapping(target = "actedInMovies", expression = "java(new java.util.ArrayList<>())")
    public abstract hu.nextval.imdb.app.actor.ActorEntity mapFromRequestToMinimalEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.dto.ActorCreateUpdateRequest actorRequest);
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.ActorEntity mapFromRequestToEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.dto.ActorCreateUpdateRequest actorRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Named(value = "getMovies")
    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> map(@org.jetbrains.annotations.Nullable
    java.util.List<hu.nextval.imdb.app.movie.MovieEntity> movies) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lhu/nextval/imdb/app/actor/dto/ActorMapper$Companion;", "", "()V", "map", "", "", "movies", "Lhu/nextval/imdb/app/movie/MovieEntity;", "imdb-app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @org.mapstruct.Named(value = "getMovies")
        @kotlin.jvm.JvmStatic
        public final java.util.List<java.lang.String> map(@org.jetbrains.annotations.Nullable
        java.util.List<hu.nextval.imdb.app.movie.MovieEntity> movies) {
            return null;
        }
    }
}