package com.victor.task8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.victor.task8")
public class SpringDiRun {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringDiRun.class);
        OrderProcessor processor = context.getBean(OrderProcessor.class);
        processor.processOrder("ORD-2026-88");
    }
}
