package com.scaler.lld.design.structural.decorator.notification.v2;

import com.scaler.lld.design.structural.decorator.notification.Notifier;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.EmailNotification;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.SmsNotification;

public class EmailSMSPushNotification implements Notifier {
    @Override
    public void sendMessage() {
        EmailNotification emailNotification=new EmailNotification();
        emailNotification.sendMessage();
        SmsNotification smsNotification=new SmsNotification();
        smsNotification.sendMessage();
        PushNotification push=new PushNotification();
        push.sendMessage();
        // now for every combination i have to create such class --> CLASS EXPLOSION
    }
}
