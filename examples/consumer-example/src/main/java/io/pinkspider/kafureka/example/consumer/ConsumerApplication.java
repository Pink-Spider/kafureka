package io.pinkspider.kafureka.example.consumer;

import io.pinkspider.kafureka.spring.annotation.EnableKafkaDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableKafkaDiscovery
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @KafkaListener(topics = "test-topic", groupId = "kafureka-consumer")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}