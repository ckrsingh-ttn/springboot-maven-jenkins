package com.maven.jenkins.springbootmavenjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMavenJenkinsApplication {

    @GetMapping("/")
    String index(){
        return "Hello Jenkins V6";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMavenJenkinsApplication.class, args);
    }

}
