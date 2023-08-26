package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration()
@ComponentScan(basePackages = "com.example.demo")
@ImportResource("classpath:spring-context.xml")
public class JavaConfig {

}
