package hu.nextval.imdb.app.director;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lhu/nextval/imdb/app/director/JPADirectorRepository;", "Lhu/nextval/imdb/app/director/DirectorRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lhu/nextval/imdb/app/director/DirectorEntity;", "", "findByActorName", "", "name", "", "findByName", "imdb-app"})
@org.springframework.stereotype.Repository
@org.springframework.context.annotation.Primary
public abstract interface JPADirectorRepository extends hu.nextval.imdb.app.director.DirectorRepository, org.springframework.data.jpa.repository.JpaRepository<hu.nextval.imdb.app.director.DirectorEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.jpa.repository.Query(value = "SELECT d from DirectorEntity d where UPPER(d.name) LIKE UPPER(:name)")
    public abstract hu.nextval.imdb.app.director.DirectorEntity findByName(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "name")
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.data.jpa.repository.Query(value = "select distinct d from DirectorEntity d join d.moviesDirected m join m.actors a where a.name = :actorName")
    public abstract java.util.List<hu.nextval.imdb.app.director.DirectorEntity> findByActorName(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "actorName")
    java.lang.String name);
}