package com.example.controler;

import java.util.List;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping(value = "/hello")
    public String getCities() {

        return "Hello !";
    }

}
