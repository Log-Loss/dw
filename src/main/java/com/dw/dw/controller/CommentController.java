package com.dw.dw.controller;

import com.dw.dw.repository.CommentRepository;
import com.dw.dw.repository.DirectorRepository;
import com.dw.dw.repository.MovieRepository;
import com.dw.dw.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    public Object index(String productId, String userId, Integer page, Integer pageSize) {
        Object result;
        if (productId == null && userId == null) {
            return null;
        }
        if (productId == null) {
            result = commentRepository.findByUserId(userId);
        } else if (userId == null) {
            result = commentRepository.findByProductId(productId);
        } else {
            result = commentRepository.findByProductIdAndUserId(productId, userId);
        }
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/comment/productId/{productId}", method = RequestMethod.GET)
    public Object findByProductId(@PathVariable String productId, Integer page, Integer pageSize) {
        Object result = commentRepository.findByProductId(productId);
        return new Response(200, "OK", result, true, page, pageSize);
    }

    @RequestMapping(value = "/comment/userId/{userId}", method = RequestMethod.GET)
    public Object findByUserId(@PathVariable String userId, Integer page, Integer pageSize) {
        Object result = commentRepository.findByUserId(userId);
        return new Response(200, "OK", result, true, page, pageSize);
    }
}
