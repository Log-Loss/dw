package com.dw.dw.controller;

import com.dw.dw.entity.Movie;
import com.dw.dw.repository.MovieRepository;
import com.dw.dw.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@RestController
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;


    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public Object findByProductId(@PathVariable String id) {
        return movieRepository.findByProductId(id);
    }

    @RequestMapping(value = "/movies/query", method = RequestMethod.POST)
    public Object findByProductId(@RequestBody String[] queryBody) {
        Object result = movieRepository.findByProductIdIn(queryBody);
        return new Response(200, "OK", result, false);
    }

    @RequestMapping(value = "/movie/query", method = RequestMethod.POST)
    public Object query(@RequestBody QueryBody queryBody, Integer page, Integer pageSize) {
        Boolean flag = false;
        Set<Movie> movieSet = new HashSet<>();
        for (String title :
                queryBody.titles) {
            if (!flag) {
                movieSet.addAll(movieRepository.findByTitle(title));
                flag = true;
                continue;
            }
            movieSet.retainAll(movieRepository.findByTitle(title));
        }
        for (DateRange dateRange :
                queryBody.dateRanges) {
            if (!flag) {
                movieSet.addAll(movieRepository.findInDateRange(Date.valueOf(dateRange.startDate), Date.valueOf(dateRange.endDate)));
                flag = true;
                continue;
            }
            movieSet.retainAll(movieRepository.findInDateRange(Date.valueOf(dateRange.startDate), Date.valueOf(dateRange.endDate)));
        }
        for (String actor :
                queryBody.actors) {
            if (!flag) {
                movieSet.addAll(movieRepository.findByActor(actor));
                flag = true;
                continue;
            }
            movieSet.retainAll(movieRepository.findByActor(actor));
        }
        for (String director :
                queryBody.directors) {
            if (!flag) {
                movieSet.addAll(movieRepository.findByDirector(director));
                flag = true;
                continue;
            }
            movieSet.retainAll(movieRepository.findByDirector(director));
        }
        for (String genre :
                queryBody.genres) {
            if (!flag) {
                movieSet.addAll(movieRepository.findByGenre(genre));
                flag = true;
                continue;
            }
            movieSet.retainAll(movieRepository.findByGenre(genre));
        }
        return new Response(200, "OK", new ArrayList<Object>(movieSet), true, page, pageSize);
    }

    @RequestMapping(value = "/movie/genre/{genre}", method = RequestMethod.GET)
    public Object findByGenre(@PathVariable String genre, Integer page, Integer pageSize) {
        Object result = movieRepository.findByGenre(genre);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/movie/title/{title}", method = RequestMethod.GET)
    public Object findByTitle(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = movieRepository.findByTitle(title);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/movie/dateRange/", method = RequestMethod.GET)
    public Object findInDateRange(String startDate, String endDate, Integer page, Integer pageSize) {
        Object result = movieRepository.findInDateRange(Date.valueOf(startDate), Date.valueOf(endDate));
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/movie/actor/{actor}", method = RequestMethod.GET)
    public Object findByActor(@PathVariable String actor, Integer page, Integer pageSize) {
        Object result = movieRepository.findByActor(actor);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/movie/director/{director}", method = RequestMethod.GET)
    public Object findByDirector(@PathVariable String director, Integer page, Integer pageSize) {
        Object result = movieRepository.findByDirector(director);
        return new Response(200, "OK", result, true, page, pageSize);
    }
}
