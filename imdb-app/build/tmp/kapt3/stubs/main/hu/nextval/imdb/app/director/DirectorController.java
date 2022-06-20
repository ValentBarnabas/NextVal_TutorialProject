package hu.nextval.imdb.app.director;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017J\u0012\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0017J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017J\u0012\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lhu/nextval/imdb/app/director/DirectorController;", "", "service", "Lhu/nextval/imdb/app/director/DirectorService;", "mapper", "Lhu/nextval/imdb/app/director/dto/DirectorMapper;", "(Lhu/nextval/imdb/app/director/DirectorService;Lhu/nextval/imdb/app/director/dto/DirectorMapper;)V", "getMapper", "()Lhu/nextval/imdb/app/director/dto/DirectorMapper;", "getService", "()Lhu/nextval/imdb/app/director/DirectorService;", "delete", "", "id", "", "findByActorName", "", "Lhu/nextval/imdb/app/director/dto/DirectorResponse;", "name", "", "findById", "getAll", "post", "directorRequest", "Lhu/nextval/imdb/app/director/dto/DirectorCreateUpdateRequest;", "put", "imdb-app"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/director"})
@org.springframework.web.bind.annotation.RestController
public class DirectorController {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.director.DirectorService service = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.director.dto.DirectorMapper mapper = null;
    
    public DirectorController(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.DirectorService service, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.director.dto.DirectorMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.director.DirectorService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.director.dto.DirectorMapper getMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<hu.nextval.imdb.app.director.dto.DirectorResponse> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public hu.nextval.imdb.app.director.dto.DirectorResponse findById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/actor/{name}"})
    public java.util.List<hu.nextval.imdb.app.director.dto.DirectorResponse> findByActorName(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public hu.nextval.imdb.app.director.dto.DirectorResponse post(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.director.dto.DirectorCreateUpdateRequest directorRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping
    public hu.nextval.imdb.app.director.dto.DirectorResponse put(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.director.dto.DirectorCreateUpdateRequest directorRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void delete(@org.springframework.web.bind.annotation.PathVariable
    long id) {
    }
}