package com.poc.newrelic.presentation.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/message")
    fun getMessage(): ResponseEntity<String> {
        return ResponseEntity
            .ok()
            .body("Hello, World!")
    }

}