package com.codeup.spring_blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String showPosts(){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showIdPosts(@PathVariable Integer id){
        return "view an individual post " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePost(){
        return "view the form for creating a post";
    }

//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String createPost(){
//        return "create a new post";
//    }
}