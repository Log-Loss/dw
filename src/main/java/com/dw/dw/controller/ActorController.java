package com.dw.dw.controller;

import com.dw.dw.repository.ActorRepository;
import com.dw.dw.repository.MovieRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(value = "/actor/{name}", method = RequestMethod.GET)
    public Object index(@PathVariable String name) {
        Object result = actorRepository.findByActor(name);
        return new Response(200, "OK", result, false);
    }
}
