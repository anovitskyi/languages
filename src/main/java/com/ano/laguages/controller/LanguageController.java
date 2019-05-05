package com.ano.laguages.controller;

import com.ano.laguages.utils.BotAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class LanguageController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/say-hello", produces = "text/plain")
    public String sayHello() {
        log.info("Say hello method launched");
        return "Hello world";
    }

    @GetMapping(value = "getMessages", produces = "application/json")
    public String getMessages() {
        log.info("Retrieving list of anono_bot messages");
        return restTemplate.getForEntity(BotAPI.getUpdates(), String.class).getBody();
    }

}
