package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014\u00a8\u0006-"}, d2 = {"Lhu/nextval/imdb/app/movie/MovieEntity;", "", "title", "", "description", "director", "Lhu/nextval/imdb/app/director/DirectorEntity;", "actors", "", "Lhu/nextval/imdb/app/actor/ActorEntity;", "id", "", "(Ljava/lang/String;Ljava/lang/String;Lhu/nextval/imdb/app/director/DirectorEntity;Ljava/util/List;Ljava/lang/Long;)V", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDirector", "()Lhu/nextval/imdb/app/director/DirectorEntity;", "setDirector", "(Lhu/nextval/imdb/app/director/DirectorEntity;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lhu/nextval/imdb/app/director/DirectorEntity;Ljava/util/List;Ljava/lang/Long;)Lhu/nextval/imdb/app/movie/MovieEntity;", "equals", "", "other", "hashCode", "", "toString", "imdb-app"})
@javax.persistence.Entity
public final class MovieEntity {
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private hu.nextval.imdb.app.director.DirectorEntity director;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinTable(name = "actors_in_movie", joinColumns = {@javax.persistence.JoinColumn(name = "actor_id")}, inverseJoinColumns = {@javax.persistence.JoinColumn(name = "movie_id")})
    @javax.persistence.ManyToMany
    private java.util.List<hu.nextval.imdb.app.actor.ActorEntity> actors;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.SequenceGenerator(name = "movieGenerator", sequenceName = "movSeq", allocationSize = 1)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "movieGenerator")
    @javax.persistence.Id
    private java.lang.Long id;
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.movie.MovieEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    hu.nextval.imdb.app.director.DirectorEntity director, @org.jetbrains.annotations.NotNull
    java.util.List<hu.nextval.imdb.app.actor.ActorEntity> actors, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieEntity(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    hu.nextval.imdb.app.director.DirectorEntity director, @org.jetbrains.annotations.NotNull
    java.util.List<hu.nextval.imdb.app.actor.ActorEntity> actors, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final hu.nextval.imdb.app.director.DirectorEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final hu.nextval.imdb.app.director.DirectorEntity getDirector() {
        return null;
    }
    
    public final void setDirector(@org.jetbrains.annotations.Nullable
    hu.nextval.imdb.app.director.DirectorEntity p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<hu.nextval.imdb.app.actor.ActorEntity> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<hu.nextval.imdb.app.actor.ActorEntity> getActors() {
        return null;
    }
    
    public final void setActors(@org.jetbrains.annotations.NotNull
    java.util.List<hu.nextval.imdb.app.actor.ActorEntity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}