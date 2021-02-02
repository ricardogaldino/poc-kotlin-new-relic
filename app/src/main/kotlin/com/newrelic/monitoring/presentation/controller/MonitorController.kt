package com.newrelic.monitoring.presentation.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MonitorController {
    @GetMapping("/helloworld")
    fun getHelloWorld(): ResponseEntity<String> {
        return ResponseEntity
            .ok()
            .body("Hello, World!")
    }
}