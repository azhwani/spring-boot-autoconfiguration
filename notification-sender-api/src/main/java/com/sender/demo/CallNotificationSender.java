package com.sender.demo;

import com.sender.demo.services.NotificationSenderService;

public class CallNotificationSender implements NotificationSenderService {

    @Override
    public void sendNotification(String contactInfo, SenderTemplate template) {
        // TODO Auto-generated method stub

        System.out.println("Phone Call");
    }

}
