package com.example.SpringProfiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {


    @Value("${name}")
    String name;

    @GetMapping("/valueFromProps")
    public String getValueFromProperties(){
        return name;
    }
}
