package com.dw.dw.controller;

import com.dw.dw.repository.TitleRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;

    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
    public Object index(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = titleRepository.findByTitle(title);
        return new Response(200, "OK", result, false);
    }

    @RequestMapping(value = "/title/containing/{title}", method = RequestMethod.GET)
    public Object containing(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = titleRepository.findByTitleContaining(title);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/title/like/{title}", method = RequestMethod.GET)
    public Object like(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = titleRepository.findByTitleLike(title);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/title/starting/{title}", method = RequestMethod.GET)
    public Object starting(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = titleRepository.findByTitleStartingWith(title);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/title/contains/{title}", method = RequestMethod.GET)
    public Object contains(@PathVariable String title, Integer page, Integer pageSize) {
        Object result = titleRepository.findByTitleContains(title);
        return new Response(200, "OK", result, true, page, pageSize);
    }
}
