package ua.kpi.tef.pubsubtest.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceivingApp {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "receiving-app");

        SpringApplication.run(ReceivingApp.class, args);
    }
}
