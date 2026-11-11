package com.victor.task8;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendAlert(String message) {
        System.out.println("[EMAIL DISPATCH]: " + message);
    }
}
