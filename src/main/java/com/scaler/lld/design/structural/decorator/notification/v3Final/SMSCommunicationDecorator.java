package com.scaler.lld.design.structural.decorator.notification.v3Final;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public class SMSCommunicationDecorator extends CommunicationDecorator{

    public SMSCommunicationDecorator(Notifier notifier){
        super(notifier);
    }
    @Override
    public void sendMessage() {
        notifier.sendMessage();
        System.out.println("sending SMS to user");

    }
}
