package com.github.majidshoorabi.configh2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigH2DBApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigH2DBApplication.class, args);
    }

}
