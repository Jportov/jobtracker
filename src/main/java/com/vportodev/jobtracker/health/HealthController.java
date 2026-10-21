package com.vportodev.jobtracker.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class HealthController {

    public record HealthResponse(String status, Instant timestamp) {
    }

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP", Instant.now());
    }
}