package com.dw.dw.controller;

import com.dw.dw.repository.*;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@RestController
public class InfoController {
    @Autowired
    private ActorRepository actorRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private DirectorRepository directorRepository;
    @Autowired
    private DirectorActorRepository directorActorRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private TitleRepository titleRepository;
    @Autowired
    private UserRepository userRepository;
    private long actor;
    private long comment;
    private long director;
    private long directorActor;
    private long movie;
    private long title;
    private long user;

    @PostConstruct
    private void cache() {
        actor = actorRepository.count();
        comment = commentRepository.count();
        director = directorRepository.count();
        directorActor = directorActorRepository.count();
        movie = movieRepository.count();
        title = titleRepository.count();
        user = userRepository.count();
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Object index(Boolean useCache) {
        if (!useCache) {
            cache();
        }
        HashMap<String, Long> result = new HashMap<>();
        result.put("actor", actor);
        result.put("comment", comment);
        result.put("director", director);
        result.put("directorActor", directorActor);
        result.put("movie", movie);
        result.put("title", title);
        result.put("user", user);
        return new Response(200, "OK", result, false);
    }
}
