package com.dw.dw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dw.dw.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DwApplicationTests {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void contextLoads() {
        long a = commentRepository.count();
        System.out.println(a);

        movieRepository.findAll();
    }

}
