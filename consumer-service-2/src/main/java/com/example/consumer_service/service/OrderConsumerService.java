package com.example.consumer_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

    @KafkaListener(
            topics = "orders-topic",
            groupId = "order-processing-group",
            concurrency = "1"
    )
    public void consume(String message) {
        System.out.println("Consumed by service 2: " + message + " | Thread: " + Thread.currentThread().getName());
    }
}
