package com.example.hellobatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
// 스프링 3.0 이상은 해당 어노테이션을 사용하지 않는다.
public class HelloBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloBatchApplication.class, args);
    }

}
