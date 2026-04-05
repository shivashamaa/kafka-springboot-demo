package com.example.producer_service.controller;

import com.example.producer_service.service.OrderProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducerService producer;

    @PostMapping
    public String sendOrder(@RequestParam String orderId, @RequestParam String order) {
        producer.sendOrder(orderId,order);
        return "Order sent";
    }
}
