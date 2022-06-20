package hu.nextval.imdb.ratingsapp.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0017J\u0012\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\fH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lhu/nextval/imdb/ratingsapp/user/UserController;", "", "service", "Lhu/nextval/imdb/ratingsapp/user/UserService;", "(Lhu/nextval/imdb/ratingsapp/user/UserService;)V", "getService", "()Lhu/nextval/imdb/ratingsapp/user/UserService;", "delete", "", "id", "", "findById", "Lhu/nextval/imdb/ratingsapp/user/UserEntity;", "getAll", "", "post", "userRequest", "put", "rating-app-core"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/users"})
@org.springframework.web.bind.annotation.RestController
public class UserController {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.user.UserService service = null;
    
    public UserController(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.user.UserService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.user.UserService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public java.util.List<hu.nextval.imdb.ratingsapp.user.UserEntity> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public hu.nextval.imdb.ratingsapp.user.UserEntity findById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public hu.nextval.imdb.ratingsapp.user.UserEntity post(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.ratingsapp.user.UserEntity userRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public hu.nextval.imdb.ratingsapp.user.UserEntity put(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.ratingsapp.user.UserEntity userRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public void delete(@org.springframework.web.bind.annotation.PathVariable
    long id) {
    }
}