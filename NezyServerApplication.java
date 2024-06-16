package com.nezy_groups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.nezy_groups.models"})
public class NezyServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NezyServerApplication.class, args);
    }
}
