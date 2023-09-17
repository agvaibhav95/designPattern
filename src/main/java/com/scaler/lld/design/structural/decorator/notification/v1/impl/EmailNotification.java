package com.scaler.lld.design.structural.decorator.notification.v1.impl;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public class EmailNotification implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Email sent");
    }
    // if i want to send sms with email then i have to change/modify this class either sms or email class
    //OCP violation
    //srp voilation
}
