package hu.nextval.imdb.ratingsapp.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lhu/nextval/imdb/ratingsapp/user/UserService;", "", "db", "Lhu/nextval/imdb/ratingsapp/user/UserRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lhu/nextval/imdb/ratingsapp/user/UserRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "getDb", "()Lhu/nextval/imdb/ratingsapp/user/UserRepository;", "getPasswordEncoder", "()Lorg/springframework/security/crypto/password/PasswordEncoder;", "deleteUserById", "", "id", "", "getUserById", "Lhu/nextval/imdb/ratingsapp/user/UserEntity;", "getUsers", "", "postUser", "userEntity", "updateUser", "rating-app-core"})
@org.springframework.stereotype.Service
public class UserService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.user.UserRepository db = null;
    @org.jetbrains.annotations.NotNull
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    public UserService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.user.UserRepository db, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.user.UserRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.security.crypto.password.PasswordEncoder getPasswordEncoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.ratingsapp.user.UserEntity> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.user.UserEntity getUserById(long id) {
        return null;
    }
    
    public void postUser(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.user.UserEntity userEntity) {
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.user.UserEntity updateUser(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.user.UserEntity userEntity) {
        return null;
    }
    
    public void deleteUserById(long id) {
    }
}