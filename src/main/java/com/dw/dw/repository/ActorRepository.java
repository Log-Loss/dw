package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    Actor findByActor(String name);
}