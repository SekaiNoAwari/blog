package pers.fjl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BlogConfigurationApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogConfigurationApplication.class, args);
    }
}
