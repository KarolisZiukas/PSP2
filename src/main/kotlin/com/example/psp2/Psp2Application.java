package com.example.psp2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Psp2Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext cx =	SpringApplication.run(Psp2Application.class, args);
    }
}
