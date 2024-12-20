package com.relations.crud.controller;

import com.relations.crud.model.Post;
import com.relations.crud.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {
    @Autowired
    private IPostService postService;
    @PostMapping("/post")
    public void crearPost(@RequestBody Post post) {
        postService.crearPost(post);
    }
}
