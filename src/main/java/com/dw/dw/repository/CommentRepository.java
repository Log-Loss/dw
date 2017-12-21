package com.dw.dw.repository;


import com.dw.dw.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByUserId(String userId);

    List<Comment> findByProductId(String productId);

    List<Comment> findByProductIdAndUserId(String productId, String userId);
}