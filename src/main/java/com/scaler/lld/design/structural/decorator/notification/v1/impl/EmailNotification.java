package com.scaler.lld.design.structural.decorator.notification.v1.impl;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public class EmailNotification implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Email sent");
    }
}
