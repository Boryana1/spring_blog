package com.codeup.spring_blog.controllers;

import com.codeup.spring_blog.repositories.PostRepository;

public class PostTableController {
    private final PostRepository postDao;

    public PostTableController(PostRepository postDao) {
        this.postDao = postDao;
    }
}
