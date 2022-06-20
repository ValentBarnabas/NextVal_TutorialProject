package hu.nextval.imdb.app.director;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lhu/nextval/imdb/app/director/DirectorService;", "", "db", "Lhu/nextval/imdb/app/director/DirectorRepository;", "(Lhu/nextval/imdb/app/director/DirectorRepository;)V", "getDb", "()Lhu/nextval/imdb/app/director/DirectorRepository;", "deleteDirectorById", "", "id", "", "getDirectorByActorName", "", "Lhu/nextval/imdb/app/director/DirectorEntity;", "name", "", "getDirectorById", "Ljava/util/Optional;", "getDirectors", "postDirector", "directorEntity", "updateDirector", "imdb-app"})
@org.springframework.stereotype.Service
public class DirectorService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.director.DirectorRepository db = null;
    
    public DirectorService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorRepository db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.director.DirectorRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.director.DirectorEntity> getDirectors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Optional<hu.nextval.imdb.app.director.DirectorEntity> getDirectorById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.director.DirectorEntity> getDirectorByActorName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.director.DirectorEntity postDirector(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorEntity directorEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.director.DirectorEntity updateDirector(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorEntity directorEntity) {
        return null;
    }
    
    public void deleteDirectorById(long id) {
    }
}