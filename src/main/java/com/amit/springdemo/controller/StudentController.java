package com.amit.springdemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<String> getAllListData(){
        return List.of(
                "Amit","Rohan","Sagar"
        );
    }
}
