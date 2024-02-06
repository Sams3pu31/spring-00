package com.myproject.spring00.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/cattison")
    public String hello(@RequestParam(value = "name", defaultValue = "Mlem") String name) {
        return String.format("I am a cat %s!", name);
    }

}
