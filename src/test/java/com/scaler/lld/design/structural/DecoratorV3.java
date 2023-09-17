package com.scaler.lld.design.structural;

import com.scaler.lld.design.structural.decorator.notification.v1.impl.EmailNotification;
import com.scaler.lld.design.structural.decorator.notification.v3Final.PushCommunication;
import com.scaler.lld.design.structural.decorator.notification.v3Final.SMSCommunicationDecorator;
import org.junit.Test;

public class DecoratorV3 {

    @Test
    public void sendMessage(){
        EmailNotification emailNotification=new EmailNotification();
        SMSCommunicationDecorator smsCommunicationDecorator=new SMSCommunicationDecorator(emailNotification);
        PushCommunication pushCommunication=new PushCommunication(smsCommunicationDecorator);
        pushCommunication.sendMessage();

    }
}
