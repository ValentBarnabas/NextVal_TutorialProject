package hu.nextval.imdb.ratingsapp.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0002\u001a\u00020\u0011H\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lhu/nextval/imdb/ratingsapp/security/SecurityConfiguration;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "userDetailsService", "Lhu/nextval/imdb/ratingsapp/security/CustomUserDetailsService;", "(Lhu/nextval/imdb/ratingsapp/security/CustomUserDetailsService;)V", "getUserDetailsService", "()Lhu/nextval/imdb/ratingsapp/security/CustomUserDetailsService;", "authProvider", "Lorg/springframework/security/authentication/dao/DaoAuthenticationProvider;", "configure", "", "auth", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "rating-app-core"})
@org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity(prePostEnabled = true)
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class SecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.security.CustomUserDetailsService userDetailsService = null;
    
    public SecurityConfiguration(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.security.CustomUserDetailsService userDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.security.CustomUserDetailsService getUserDetailsService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.authentication.dao.DaoAuthenticationProvider authProvider() {
        return null;
    }
    
    @java.lang.Override
    protected void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected org.springframework.security.core.userdetails.UserDetailsService userDetailsService() {
        return null;
    }
    
    @java.lang.Override
    protected void configure(@org.jetbrains.annotations.NotNull
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
    }
}