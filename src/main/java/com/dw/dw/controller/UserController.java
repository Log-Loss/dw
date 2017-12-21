package com.dw.dw.controller;

import com.dw.dw.repository.MovieRepository;
import com.dw.dw.repository.UserRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Object findByUserId(@PathVariable String id) {
        Object result = userRepository.findByUserId(id);
        return new Response(200, "OK", result, false);
    }
}
