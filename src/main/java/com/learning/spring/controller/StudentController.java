package com.learning.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/hi")
    public String student() {
        return "Hi Mayur";
    }
}
