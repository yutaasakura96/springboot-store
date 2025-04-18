package com.springbootplayground.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email Notification service: " + message);
    }

}
