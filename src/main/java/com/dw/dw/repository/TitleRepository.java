package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

public interface TitleRepository extends JpaRepository<Title, Long> {

    Title findByTitle(String title);
}