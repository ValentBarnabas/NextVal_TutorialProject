package hu.nextval.imdb.ratingsapp.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lhu/nextval/imdb/ratingsapp/user/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lhu/nextval/imdb/ratingsapp/user/UserEntity;", "", "findByName", "name", "", "rating-app-core"})
@org.springframework.stereotype.Repository
@org.springframework.context.annotation.Primary
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<hu.nextval.imdb.ratingsapp.user.UserEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.data.jpa.repository.Query(value = "SELECT u from UserEntity u where UPPER(u.username) LIKE UPPER(:name)")
    public abstract hu.nextval.imdb.ratingsapp.user.UserEntity findByName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
}