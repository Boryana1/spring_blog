package com.codeup.spring_blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String showPosts(Model model){
        ArrayList<Post> allPosts = new ArrayList<>();
        allPosts.add(new Post("Good news, this is my first post", "Post 1"));
        allPosts.add(new Post("Even better news, this is my second post", "Post 2"));

        model.addAttribute("allPosts", allPosts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showIdPosts(@PathVariable Integer id, Model model){

        model.addAttribute("singlePost", new Post("Title","Body"));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreatePost(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }
}