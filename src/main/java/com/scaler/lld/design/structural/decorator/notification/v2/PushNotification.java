package com.scaler.lld.design.structural.decorator.notification.v2;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public class PushNotification implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("push notification sent");
    }
}
