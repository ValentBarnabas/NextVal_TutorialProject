package hu.nextval.imdb.app.director;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0011"}, d2 = {"Lhu/nextval/imdb/app/director/DirectorRepository;", "", "delete", "", "directorEntity", "Lhu/nextval/imdb/app/director/DirectorEntity;", "deleteById", "id", "", "findAll", "", "findByActorName", "name", "", "findById", "Ljava/util/Optional;", "save", "imdb-app"})
public abstract interface DirectorRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<hu.nextval.imdb.app.director.DirectorEntity> findAll();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Optional<hu.nextval.imdb.app.director.DirectorEntity> findById(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.director.DirectorEntity save(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorEntity directorEntity);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorEntity directorEntity);
    
    public abstract void deleteById(long id);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<hu.nextval.imdb.app.director.DirectorEntity> findByActorName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}