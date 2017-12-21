package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserId(String id);
}