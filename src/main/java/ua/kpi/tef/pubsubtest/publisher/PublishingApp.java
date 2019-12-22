package ua.kpi.tef.pubsubtest.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublishingApp {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "publishing-app");

        SpringApplication.run(PublishingApp.class, args);
    }
}
