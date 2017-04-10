package com.scully;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiClientApplication {


    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        SpringApplication.run(ApiClientApplication.class, args);
        String response = restTemplate.getForObject("http://localhost:8081", String.class);
        System.out.println(response);
    }
}
