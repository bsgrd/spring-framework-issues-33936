package com.example.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
    @PostMapping
    void post(@Valid @RequestBody TestRecord body) {
        System.out.println("POST request received");
    }

    record TestRecord(@NotBlank String name, int age) {}

}
