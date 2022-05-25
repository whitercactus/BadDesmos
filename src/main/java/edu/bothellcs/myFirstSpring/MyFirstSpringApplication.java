package edu.bothellcs.myFirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringApplication.class, args);
    }

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/add")
    public String add(
            @RequestParam(value = "A", defaultValue = "0") String a,
            @RequestParam(value = "B", defaultValue = "0") String b) {
        return String.format("Answer: %f", Double.parseDouble(a) + Double.parseDouble(b));
    }
}
