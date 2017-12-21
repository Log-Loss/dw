package com.dw.dw.controller;

import com.dw.dw.repository.MovieRepository;
import com.dw.dw.repository.TitleRepository;
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
    public Object index(@PathVariable String title) {
        return titleRepository.findByTitle(title);
    }
}