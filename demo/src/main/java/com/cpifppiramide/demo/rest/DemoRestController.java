package com.cpifppiramide.demo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/param/{number}")
    String showNumber(@PathVariable String number){
        return "Has enviado " + number;
    }

}
