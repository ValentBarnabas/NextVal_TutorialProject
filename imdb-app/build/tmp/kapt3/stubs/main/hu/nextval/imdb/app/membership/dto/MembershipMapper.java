package hu.nextval.imdb.app.membership.dto;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lhu/nextval/imdb/app/membership/dto/MembershipMapper;", "", "mapFromEntityToResponse", "Lhu/nextval/imdb/app/membership/dto/MembershipResponse;", "membershipEntity", "Lhu/nextval/imdb/app/membership/MembershipEntity;", "Companion", "imdb-app"})
public abstract interface MembershipMapper {
    @org.jetbrains.annotations.NotNull
    public static final hu.nextval.imdb.app.membership.dto.MembershipMapper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Mapping(source = "membershipEntity.academy", target = "academy", qualifiedByName = {"getAOAName"})
    @org.mapstruct.Mapping(source = "membershipEntity.actor", target = "actor", qualifiedByName = {"getActorName"})
    public abstract hu.nextval.imdb.app.membership.dto.MembershipResponse mapFromEntityToResponse(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.membership.MembershipEntity membershipEntity);
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Named(value = "getActorName")
    @kotlin.jvm.JvmStatic
    public static java.lang.String map(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.mapstruct.Named(value = "getAOAName")
    @kotlin.jvm.JvmStatic
    public static java.lang.String map(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity aoa) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lhu/nextval/imdb/app/membership/dto/MembershipMapper$Companion;", "", "()V", "map", "", "aoa", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;", "actor", "Lhu/nextval/imdb/app/actor/ActorEntity;", "imdb-app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @org.mapstruct.Named(value = "getActorName")
        @kotlin.jvm.JvmStatic
        public final java.lang.String map(@org.jetbrains.annotations.NotNull
        hu.nextval.imdb.app.actor.ActorEntity actor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @org.mapstruct.Named(value = "getAOAName")
        @kotlin.jvm.JvmStatic
        public final java.lang.String map(@org.jetbrains.annotations.NotNull
        hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity aoa) {
            return null;
        }
    }
}