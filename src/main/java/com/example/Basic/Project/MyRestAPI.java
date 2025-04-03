package com.example.Basic.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestAPI {

    @GetMapping("/hello")
    public String myRestAPI(){
        return "Hello World, I am Learning REST API implementing using springboot application";
    }
}
