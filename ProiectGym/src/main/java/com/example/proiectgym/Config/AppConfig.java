package com.example.proiectgym.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SomeService someService() {
        return new SomeServiceImpl();
    }
}
