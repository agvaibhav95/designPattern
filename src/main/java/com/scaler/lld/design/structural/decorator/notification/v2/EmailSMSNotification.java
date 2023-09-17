package com.scaler.lld.design.structural.decorator.notification.v2;

import com.scaler.lld.design.structural.decorator.notification.Notifier;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.EmailNotification;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.SmsNotification;

public class EmailSMSNotification implements Notifier {
    @Override
    public void sendMessage() {
        EmailNotification emailNotification=new EmailNotification();
        emailNotification.sendMessage();
        SmsNotification smsNotification=new SmsNotification();
        smsNotification.sendMessage();
        // if i need to send both email and sms then i created seperate class in order to avoid SRP/OCP
        //but this lead to CLASS EXPLOSION as we will be ending with all combinations of class as
        // we are tying behaviur to class level.

    }
}
