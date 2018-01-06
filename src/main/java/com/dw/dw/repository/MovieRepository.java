package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByProductId(String id);

    List<Movie> findByProductIdIn(String[] ids);

    List<Movie> findByTitle(String title);

    List<Movie> findByGenre(String genre);

    @Query("SELECT m FROM Movie m WHERE m.publication_date BETWEEN :startDate AND :endDate")
    List<Movie> findInDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query(value = "SELECT m FROM Movie m WHERE productId in (SELECT ma.productId FROM MovieActor ma WHERE ma.actor=:actor) ")
    List<Movie> findByActor(@Param("actor") String actor);

    @Query(value = "SELECT m FROM Movie m WHERE productId in (SELECT md.productId FROM MovieDirector md WHERE md.director=:director)")
    List<Movie> findByDirector(@Param("director") String director);

    @Query(nativeQuery =true,value = "select * FROM month_info")
    List<Object> getMonthInfo();

    @Query(nativeQuery =true,value = "select * FROM week_info")
    List<Object> getWeekInfo();

    @Query(nativeQuery =true,value = "select * FROM weekday_info")
    List<Object> getWeekdayInfo();

    @Query(nativeQuery =true,value = "select * FROM year_info")
    List<Object> getYearInfo();

    @Override
    long count();
}