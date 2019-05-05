package com.ano.laguages.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LanguageController {

    @GetMapping(value = "/say-hello", produces = "text/plain")
    public String sayHello() {
        log.info("Say hello method launched");
        return "Hello world";
    }

}
