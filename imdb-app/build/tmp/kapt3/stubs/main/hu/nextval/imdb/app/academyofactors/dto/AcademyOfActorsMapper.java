package hu.nextval.imdb.app.academyofactors.dto;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsMapper;", "", "mapFromEntityToResponse", "Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsResponse;", "academyOfActorsEntity", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;", "mapFromRequestToEntity", "academyOfActorsRequest", "Lhu/nextval/imdb/app/academyofactors/dto/AcademyOfActorsCreateUpdateRequest;", "imdb-app"})
public abstract interface AcademyOfActorsMapper {
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsResponse mapFromEntityToResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academyOfActorsEntity);
    
    @org.jetbrains.annotations.NotNull
    public abstract hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity mapFromRequestToEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.dto.AcademyOfActorsCreateUpdateRequest academyOfActorsRequest);
}