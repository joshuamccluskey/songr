package com.joshuamccluskey.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("hello")
    public String helloWorld() {
        return "hello-world.html";
    }
}
