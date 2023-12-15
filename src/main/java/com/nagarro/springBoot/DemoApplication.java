package com.nagarro.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class DemoApplication {

public static void main(String[] args) {
ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);


}




}


