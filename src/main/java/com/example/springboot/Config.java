package com.example.springboot;

import com.example.springboot.accessor.HelloAccessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean //when we manually create bean
    public HelloAccessor createHelloAccessor(){
        return new HelloAccessor("This accessor was created inside config");
    }
}
