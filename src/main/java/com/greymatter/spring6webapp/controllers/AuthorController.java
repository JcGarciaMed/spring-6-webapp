package com.greymatter.spring6webapp.controllers;

import com.greymatter.spring6webapp.repositories.AuthorRepository;
import com.greymatter.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    private String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors";

    }
}
