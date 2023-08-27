package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomePageController {
    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String displayHomePage() {
        return "home/index";
    }
}
