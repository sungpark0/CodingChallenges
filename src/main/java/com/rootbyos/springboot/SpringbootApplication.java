package com.rootbyos.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {

    @RequestMapping (value= "/sayHello", method= RequestMethod.GET)
    public String sayHello() {

        return "Hello Spring Boot";

    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
