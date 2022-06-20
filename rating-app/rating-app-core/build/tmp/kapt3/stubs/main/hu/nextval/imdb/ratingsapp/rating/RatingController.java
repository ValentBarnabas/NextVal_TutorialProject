package hu.nextval.imdb.ratingsapp.rating;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0017J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017J\u0012\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lhu/nextval/imdb/ratingsapp/rating/RatingController;", "Lhu/nextval/imdb/ratingsapp/api/RatingsAPI;", "service", "Lhu/nextval/imdb/ratingsapp/rating/RatingService;", "mapper", "Lhu/nextval/imdb/ratingsapp/rating/dto/RatingMapper;", "(Lhu/nextval/imdb/ratingsapp/rating/RatingService;Lhu/nextval/imdb/ratingsapp/rating/dto/RatingMapper;)V", "getMapper", "()Lhu/nextval/imdb/ratingsapp/rating/dto/RatingMapper;", "getService", "()Lhu/nextval/imdb/ratingsapp/rating/RatingService;", "deleteById", "", "id", "", "findById", "Lhu/nextval/imdb/ratingsapp/api/dto/RatingResponse;", "getAll", "", "getAllRatingsById", "post", "ratingRequest", "Lhu/nextval/imdb/ratingsapp/api/dto/RatingRequest;", "put", "rating-app-core"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/rating"})
@org.springframework.web.bind.annotation.RestController
public class RatingController implements hu.nextval.imdb.ratingsapp.api.RatingsAPI {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.rating.RatingService service = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.ratingsapp.rating.dto.RatingMapper mapper = null;
    
    public RatingController(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.RatingService service, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.ratingsapp.rating.dto.RatingMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.rating.RatingService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.ratingsapp.rating.dto.RatingMapper getMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public java.util.List<hu.nextval.imdb.ratingsapp.api.dto.RatingResponse> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public hu.nextval.imdb.ratingsapp.api.dto.RatingResponse findById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority(\'POST\')")
    public hu.nextval.imdb.ratingsapp.api.dto.RatingResponse post(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.ratingsapp.api.dto.RatingRequest ratingRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority(\'UPDATE\')")
    public hu.nextval.imdb.ratingsapp.api.dto.RatingResponse put(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.ratingsapp.api.dto.RatingRequest ratingRequest) {
        return null;
    }
    
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority(\'DELETE\')")
    public void deleteById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.security.access.prepost.PreAuthorize(value = "permitAll()")
    public java.util.List<hu.nextval.imdb.ratingsapp.api.dto.RatingResponse> getAllRatingsById(long id) {
        return null;
    }
}