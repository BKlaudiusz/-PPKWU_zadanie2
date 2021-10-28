package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping(value="/checkString")
    public Analysis checkString(@RequestParam("stringToCheck") String stringToCheck){
        Analysis analysis = new Analysis(stringToCheck);
        return analysis;
    }
}