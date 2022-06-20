package hu.nextval.imdb.app.actor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lhu/nextval/imdb/app/actor/ActorService;", "", "db", "Lhu/nextval/imdb/app/actor/ActorRepository;", "aoaService", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;", "(Lhu/nextval/imdb/app/actor/ActorRepository;Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;)V", "getAoaService", "()Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;", "getDb", "()Lhu/nextval/imdb/app/actor/ActorRepository;", "deleteActorById", "", "id", "", "getActorById", "Ljava/util/Optional;", "Lhu/nextval/imdb/app/actor/ActorEntity;", "getActors", "", "postActor", "actorEntity", "updateActor", "imdb-app"})
@org.springframework.stereotype.Service
public class ActorService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.actor.ActorRepository db = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.academyofactors.AcademyOfActorsService aoaService = null;
    
    public ActorService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorRepository db, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsService aoaService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.actor.ActorRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsService getAoaService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.actor.ActorEntity> getActors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Optional<hu.nextval.imdb.app.actor.ActorEntity> getActorById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.actor.ActorEntity postActor(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actorEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.actor.ActorEntity updateActor(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actorEntity) {
        return null;
    }
    
    public void deleteActorById(long id) {
    }
}