package com.example.httpmessageconvertertutorial.controller;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test")
    public LocalDateTime ldt() { return LocalDateTime.now(); }
}
