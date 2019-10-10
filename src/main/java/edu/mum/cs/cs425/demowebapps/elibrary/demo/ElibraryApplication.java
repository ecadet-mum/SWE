package edu.mum.cs.cs425.demowebapps.elibrary.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElibraryApplication.class, args);
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello my name is Emmanuel";
    }


}
