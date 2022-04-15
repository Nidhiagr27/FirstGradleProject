package com.example.springboot.service;

import com.example.springboot.accessor.HelloAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Autowired
    private HelloAccessor accessor;

    public String sendHello(){
        return accessor.sendHello();
    }
}
