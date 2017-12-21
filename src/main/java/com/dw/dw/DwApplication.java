package com.dw.dw;

import com.dw.dw.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

@SpringBootApplication
public class DwApplication {

    @Autowired
    private CommentRepository commentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DwApplication.class, args);
    }
}
