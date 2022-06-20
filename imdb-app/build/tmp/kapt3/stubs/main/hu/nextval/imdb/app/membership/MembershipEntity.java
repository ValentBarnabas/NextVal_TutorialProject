package hu.nextval.imdb.app.membership;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lhu/nextval/imdb/app/membership/MembershipEntity;", "", "actor", "Lhu/nextval/imdb/app/actor/ActorEntity;", "academy", "Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;", "startOfMembership", "Ljava/time/LocalDate;", "id", "", "(Lhu/nextval/imdb/app/actor/ActorEntity;Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;Ljava/time/LocalDate;Ljava/lang/Long;)V", "getAcademy", "()Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;", "setAcademy", "(Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;)V", "getActor", "()Lhu/nextval/imdb/app/actor/ActorEntity;", "setActor", "(Lhu/nextval/imdb/app/actor/ActorEntity;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStartOfMembership", "()Ljava/time/LocalDate;", "setStartOfMembership", "(Ljava/time/LocalDate;)V", "component1", "component2", "component3", "component4", "copy", "(Lhu/nextval/imdb/app/actor/ActorEntity;Lhu/nextval/imdb/app/academyofactors/AcademyOfActorsEntity;Ljava/time/LocalDate;Ljava/lang/Long;)Lhu/nextval/imdb/app/membership/MembershipEntity;", "equals", "", "other", "hashCode", "", "toString", "", "imdb-app"})
@javax.persistence.Entity
public final class MembershipEntity {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinColumn(name = "actorId")
    @javax.persistence.ManyToOne
    private hu.nextval.imdb.app.actor.ActorEntity actor;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.JoinColumn(name = "academyId")
    @javax.persistence.ManyToOne
    private hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academy;
    @org.jetbrains.annotations.NotNull
    private java.time.LocalDate startOfMembership;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.SequenceGenerator(name = "memGenerator", sequenceName = "memSeq", allocationSize = 1)
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "memGenerator")
    @javax.persistence.Id
    private java.lang.Long id;
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.membership.MembershipEntity copy(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actor, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academy, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startOfMembership, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
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
    
    public MembershipEntity(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity actor, @org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity academy, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startOfMembership, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.ActorEntity component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.actor.ActorEntity getActor() {
        return null;
    }
    
    public final void setActor(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.actor.ActorEntity p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity getAcademy() {
        return null;
    }
    
    public final void setAcademy(@org.jetbrains.annotations.NotNull
    hu.nextval.imdb.app.academyofactors.AcademyOfActorsEntity p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getStartOfMembership() {
        return null;
    }
    
    public final void setStartOfMembership(@org.jetbrains.annotations.NotNull
    java.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}