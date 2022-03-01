package com.joshuamccluskey.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {
    @GetMapping("capitalize/{wordsToCapitalize}")
    public String capitalize(Model m, @PathVariable String wordsToCapitalize){
        m.addAttribute("wordsCapitalized", wordsToCapitalize.toUpperCase());
        return "capitalize-words.html";

    }


}
