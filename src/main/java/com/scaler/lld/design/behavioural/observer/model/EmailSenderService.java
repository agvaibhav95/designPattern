package com.scaler.lld.design.behavioural.observer.model;

public class EmailSenderService implements NotificationService{

    @Override
    public void sendMsg(){System.out.println("Email sent");}
}
