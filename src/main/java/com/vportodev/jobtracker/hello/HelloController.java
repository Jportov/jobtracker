package com.vportodev.jobtracker.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    public record HelloResponse(String message) {
    }

    @GetMapping("/hello")
    public HelloResponse hello(@RequestParam(defaultValue = "visitor") String name) {
        return new HelloResponse("Hello, " + name + "!");
    }
}