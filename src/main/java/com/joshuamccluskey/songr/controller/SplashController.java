package com.joshuamccluskey.songr.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SplashController {
    public class HelloWorldController {
        @GetMapping("/")
        public String getSplashPage() {
            return "index.html";
        }
    }
}