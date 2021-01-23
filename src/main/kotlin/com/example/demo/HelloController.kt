package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping
class HelloController {
    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", required = false, defaultValue = "world") name: String): String {
        return "Hello, $name!"
    }
}