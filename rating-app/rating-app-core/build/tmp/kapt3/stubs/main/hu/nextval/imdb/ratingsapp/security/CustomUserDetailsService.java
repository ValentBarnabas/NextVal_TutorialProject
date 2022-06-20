package hu.nextval.imdb.ratingsapp.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lhu/nextval/imdb/ratingsapp/security/CustomUserDetailsService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "userRepository", "Lhu/nextval/imdb/ratingsapp/user/UserRepository;", "(Lhu/nextval/imdb/ratingsapp/user/UserRepository;)V", "getUserRepository", "()Lhu/nextval/imdb/ratingsapp/user/UserRepository;", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "rating-app-core"})
@org.springframework.stereotype.Service
public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.user.UserRepository userRepository = null;
    
    public CustomUserDetailsService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.user.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.user.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.Nullable
    java.lang.String username) {
        return null;
    }
}