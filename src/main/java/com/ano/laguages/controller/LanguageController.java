package com.ano.laguages.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    @GetMapping(value = "/say-hello", produces = "text/plain")
    public String sayHello() {
        return "Hello world";
    }

}
