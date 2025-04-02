package com.example.SpringProfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfiguration {

    @Profile("dev")
    @Bean(name="customer")
    public Customer getDevCustomer()
    {
        return new Customer(1,"John From DEV Environment","John@gmail.com");
    }

    @Profile("prod")
    @Bean(name="customer")
    public Customer getProdCustomer()
    {
        return new Customer(1,"John From PROD Environment","martin@gmail.com");
    }

    @Profile("uat")
    @Bean(name="customer")
    public Customer getUatCustomer()
    {
        return new Customer(1,"John From UAT Environment","martin@gmail.com");
    }
}
