package com.example.springboot3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("hello")
    public String show() {

        var v = """
                werr""";
        var str = "test";
        var o = switch (str) {
            case "A":
                yield 1;
            case "B":
                yield 2;
            default:
                yield "Test";
        };

        System.out.println(o);
        return "Hello Spring Boot 3";
    }
}
