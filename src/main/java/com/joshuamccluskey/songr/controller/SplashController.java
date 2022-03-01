package com.joshuamccluskey.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SplashController {
    public class splashPageController {
        @GetMapping("/")
        public String getSplashPage() {
            return "index.html";
        }
    }
}