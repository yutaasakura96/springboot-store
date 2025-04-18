package com.springbootplayground.store;

import org.springframework.stereotype.Service;


@Service("sms")
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("SMS Notification service: " + message);
        System.out.println("Recipient: " + recipientEmail);
    }
}
