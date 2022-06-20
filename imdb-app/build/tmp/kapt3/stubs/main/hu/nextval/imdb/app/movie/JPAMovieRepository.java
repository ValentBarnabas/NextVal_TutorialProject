package hu.nextval.imdb.app.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a8\u0006\u0005"}, d2 = {"Lhu/nextval/imdb/app/movie/JPAMovieRepository;", "Lhu/nextval/imdb/app/movie/MovieRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lhu/nextval/imdb/app/movie/MovieEntity;", "", "imdb-app"})
@org.springframework.stereotype.Repository
@org.springframework.context.annotation.Primary
public abstract interface JPAMovieRepository extends hu.nextval.imdb.app.movie.MovieRepository, org.springframework.data.jpa.repository.JpaRepository<hu.nextval.imdb.app.movie.MovieEntity, java.lang.Long> {
}