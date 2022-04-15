package com.example.springboot.accessor;

import org.springframework.stereotype.Component;

//@Component
public class HelloAccessor {

    private String greeting; //accessor is dependent on string so its bean has to be created config file

    public HelloAccessor(String greeting){
        this.greeting=greeting;
    }

    public String sendHello(){
        return this.greeting;
    }
}
