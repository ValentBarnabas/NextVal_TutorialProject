package hu.nextval.imdb.app.actor.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003JP\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lhu/nextval/imdb/app/actor/dto/ActorResponse;", "", "id", "", "name", "", "dateOfBirth", "Ljava/time/LocalDate;", "aoaRegistration", "", "Lhu/nextval/imdb/app/membership/dto/MembershipResponse;", "actedInMovies", "(Ljava/lang/Long;Ljava/lang/String;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "getActedInMovies", "()Ljava/util/List;", "getAoaRegistration", "setAoaRegistration", "(Ljava/util/List;)V", "getDateOfBirth", "()Ljava/time/LocalDate;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;)Lhu/nextval/imdb/app/actor/dto/ActorResponse;", "equals", "", "other", "hashCode", "", "toString", "imdb-app"})
public final class ActorResponse {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate dateOfBirth = null;
    @org.jetbrains.annotations.Nullable
    private java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> aoaRegistration;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> actedInMovies = null;
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.dto.ActorResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.time.LocalDate dateOfBirth, @org.jetbrains.annotations.Nullable
    java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> aoaRegistration, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> actedInMovies) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ActorResponse(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.time.LocalDate dateOfBirth, @org.jetbrains.annotations.Nullable
    java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> aoaRegistration, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> actedInMovies) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDateOfBirth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> getAoaRegistration() {
        return null;
    }
    
    public final void setAoaRegistration(@org.jetbrains.annotations.Nullable
    java.util.List<hu.nextval.imdb.app.membership.dto.MembershipResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getActedInMovies() {
        return null;
    }
}