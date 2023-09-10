package com.scaler.lld.design.structural;


import com.scaler.lld.design.structural.decorator.notification.Notifier;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.EmailNotification;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.SlackNotification;
import com.scaler.lld.design.structural.decorator.notification.v1.impl.SmsNotification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Decoratorv1 {
    private Notifier notifier;
    private Notifier notifier1;
    private Notifier notifier2;

    @Before
    public void setup(){
        notifier=new EmailNotification();
        notifier1=new SmsNotification();
        notifier2=new SlackNotification();

    }

    @Test
    public void sendEmailNotificaion(){
        notifier.sendMessage();

    }

    @Test
    public void sendSmsNotificaion(){
        notifier1.sendMessage();

    }

    @Test
    public void sendSlackNotificaion(){
        notifier2.sendMessage();

    }
//now suppose there is some otp service which wants to send all these notifications.

}
