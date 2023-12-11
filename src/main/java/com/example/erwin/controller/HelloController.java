package com.example.erwin.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String welcome() {
        return "Welcome to WaysTodo API!";
    }

}