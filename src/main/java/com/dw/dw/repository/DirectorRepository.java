package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

public interface DirectorRepository extends JpaRepository<Director, Long> {

    Director findByDirector(String name);
}