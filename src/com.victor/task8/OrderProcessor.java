package com.victor.task8;

import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String orderId) {
        System.out.println("Processing Order ID: " + orderId);
        notificationService.sendAlert("Order " + orderId + " confirmed.");
    }
}
