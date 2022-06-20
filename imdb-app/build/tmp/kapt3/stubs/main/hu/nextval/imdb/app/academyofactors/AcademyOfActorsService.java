package hu.nextval.imdb.app.academyofactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsService;", "", "db", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsRepository;", "(Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsRepository;)V", "getDb", "()Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsRepository;", "deleteAcademyById", "", "id", "", "getAcademies", "", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;", "getAcademyById", "postAcademy", "academyOfActorsEntity", "updateAcademy", "imdb-app"})
@org.springframework.stereotype.Service
public class AcademyOfActorsService {
    @org.jetbrains.annotations.NotNull
    private final hu.nextval.imdb.app.academyofactors.AcademyOfActorsRepository db = null;
    
    public AcademyOfActorsService(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsRepository db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsRepository getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity> getAcademies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity getAcademyById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity postAcademy(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academyOfActorsEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity updateAcademy(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academyOfActorsEntity) {
        return null;
    }
    
    public void deleteAcademyById(long id) {
    }
}