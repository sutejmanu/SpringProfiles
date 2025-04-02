package com.example.SpringProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

//example using different properties files
    @Value("${name}")
    String name;

    @GetMapping("/valueFromProps")
    public String getValueFromProperties(){
        return name;
    }

    //Example using @profile annotation

    @Autowired
    Customer customer;

    @GetMapping("/valueFromProfileAnnotation")
    public String getValueFromProfileAnnotation(){
        return customer.getName();
    }
}
