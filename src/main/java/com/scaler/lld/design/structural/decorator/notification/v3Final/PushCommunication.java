package com.scaler.lld.design.structural.decorator.notification.v3Final;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public class PushCommunication extends CommunicationDecorator{

    public PushCommunication(Notifier notifier){
        super(notifier);
    }
    @Override
    public void sendMessage() {
        notifier.sendMessage();
        System.out.println("sending Push message to user");
    }
}
