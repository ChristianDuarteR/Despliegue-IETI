package com.example.despliegue.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myName")
public class myNameController {
    @GetMapping
    public ResponseEntity<String> myName(){
        String myName = "Christian Javier Duarte Rojas";
        return ResponseEntity.ok(myName);
    }
}
