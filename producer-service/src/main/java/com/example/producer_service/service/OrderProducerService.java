package com.example.producer_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducerService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "orders-topic";

    public void sendOrder(String orderId,String order) {
        kafkaTemplate.send(TOPIC, orderId,order);
        System.out.println("Sent Order: " + order);
    }

}
