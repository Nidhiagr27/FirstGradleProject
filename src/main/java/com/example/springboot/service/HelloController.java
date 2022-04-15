package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@Autowired  instead this we have used constructor dependency
    private HelloService service;

    public HelloController(HelloService service) {
       this.service=service;
    }

    @GetMapping("/")
    public String index(){
        return service.sendHello();

    }
}
