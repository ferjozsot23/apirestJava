package com.epn.grupo6.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    @GetMapping(value="/")
    public String holaMundo(){
        return "Hola mundo!";
    }
}
