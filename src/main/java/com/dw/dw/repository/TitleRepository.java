package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface TitleRepository extends JpaRepository<Title, Long> {

    Title findByTitle(String title);

    List<Title> findByTitleLike(String title);

    List<Title> findByTitleContaining(String title);

    List<Title> findByTitleContains(String title);

    List<Title> findByTitleStartingWith(String title);

    @Override
    long count();
}