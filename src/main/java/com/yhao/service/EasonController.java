package com.yhao.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EasonController {
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}