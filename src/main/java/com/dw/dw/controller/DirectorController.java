package com.dw.dw.controller;

import com.dw.dw.repository.DirectorRepository;
import com.dw.dw.repository.MovieRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {
    @Autowired
    private DirectorRepository directorRepository;

    @RequestMapping(value = "/director/{name}", method = RequestMethod.GET)
    public Object index(@PathVariable String name) {
        Object result = directorRepository.findByDirector(name);
        return new Response(200, "OK", result, false);
    }
}
