package com.dw.dw.controller;

import com.dw.dw.repository.ActorRepository;
import com.dw.dw.repository.DirectorActorRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DirectorActorController {
    @Autowired
    private DirectorActorRepository directorActorRepository;

    @RequestMapping(value = "/director_actor", method = RequestMethod.GET)
    public Object index(String director, String actor, Integer page, Integer pageSize) {
        Object result;
        if (director == null && actor == null) {
            return null;
        }
        if (director == null) {
            result = directorActorRepository.findByActor(actor);
        } else if (actor == null) {
            result = directorActorRepository.findByDirector(director);
        } else {
            result = directorActorRepository.findByDirectorAndActor(director, actor);
        }
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/director_actor/actor/{actor}", method = RequestMethod.GET)
    public Object findByActor(@PathVariable String actor, Integer page, Integer pageSize) {
        Object result = directorActorRepository.findByActor(actor);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/director_actor/director/{director}", method = RequestMethod.GET)
    public Object findByDirector(@RequestParam Integer page, @RequestParam Integer pageSize, @PathVariable String director) {
        Object result = directorActorRepository.findByDirector(director);
        return new Response(200, "OK", result, true, page, pageSize);
    }
}
