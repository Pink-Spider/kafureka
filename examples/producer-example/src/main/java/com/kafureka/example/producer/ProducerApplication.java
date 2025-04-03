package com.kafureka.example.producer;

import com.kafureka.spring.annotation.EnableKafkaDiscovery;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableKafkaDiscovery
@EnableScheduling
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Bean
    public CommandLineRunner sendMessage(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("test-topic", "hello", "message from kafureka producer");
            System.out.println("Message sent!");
        };
    }

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 5000)
    public void sendMessage() {
        kafkaTemplate.send("test-topic", "auto-key", "자동 발행된 메시지: " + Instant.now());
        System.out.println("자동 메시지 발행됨!");
    }
}
