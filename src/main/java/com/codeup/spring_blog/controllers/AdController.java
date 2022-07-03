package com.codeup.spring_blog.controllers;

import com.codeup.spring_blog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
    private AdRepository adRepository;
    AdController(AdRepository adRepository){ //The Controller has access to this class
        this.adRepository = adRepository;
    }
    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adRepository.findAll());
        return "ads/index";
    }
}
