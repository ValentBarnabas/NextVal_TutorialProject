package hu.nextval.imdb.app.academyofactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017J\u0012\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsController;", "", "service", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;", "mapper", "Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsMapper;", "(Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsMapper;)V", "getMapper", "()Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsMapper;", "getService", "()Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;", "delete", "", "id", "", "findById", "Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsResponse;", "getAll", "", "post", "academyRequest", "Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsCreateUpdateRequest;", "put", "imdb-app"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/academy-of-actors"})
@org.springframework.web.bind.annotation.RestController
public class AcademyOfActorsController {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.academyofactors.AcademyOfActorsService service = null;
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsMapper mapper = null;
    
    public AcademyOfActorsController(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsService service, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsMapper getMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse findById(@org.springframework.web.bind.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse post(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsCreateUpdateRequest academyRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping
    public hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse put(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsCreateUpdateRequest academyRequest) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void delete(@org.springframework.web.bind.annotation.PathVariable
    long id) {
    }
}