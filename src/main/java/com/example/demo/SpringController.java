package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping(value="/checkString")
    public String checkString(@RequestParam("stringToCheck") String stringToCheck){
        return "";
    }
}