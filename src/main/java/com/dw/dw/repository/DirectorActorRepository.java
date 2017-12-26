package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface DirectorActorRepository extends JpaRepository<DirectorActor, Long> {

    List<DirectorActor> findByDirector(String name);

    List<DirectorActor> findByActor(String name);

    List<DirectorActor> findByDirectorAndActor(String director, String actor);

    @Override
    long count();
}