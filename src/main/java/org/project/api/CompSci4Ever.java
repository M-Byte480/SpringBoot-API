package org.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CompSci4Ever {
    public static void main(String[] args) {
        SpringApplication.run(CompSci4Ever.class, args);
    }
}