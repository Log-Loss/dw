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

    @Query("SELECT e FROM Movie e WHERE e.publication_date BETWEEN :startDate AND :endDate")
    List<Movie> findInDateRange(@Param("startDate")Date startDate, @Param("endDate")Date endDate);

    @Query(nativeQuery = true, value = "SELECT * FROM movies WHERE JSON_CONTAINS ( actors,JSON_ARRAY(:actor))")
    List<Movie> findByActor(@Param("actor") String actor);

    @Query(nativeQuery = true, value = "SELECT * FROM movies WHERE JSON_CONTAINS ( directors,JSON_ARRAY(:director))")
    List<Movie> findByDirector(@Param("director") String director);
}