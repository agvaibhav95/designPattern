package com.scaler.lld.design.behavioural.observer.model;

public class SMSSender implements NotificationService {
    @Override
    public void sendMsg(){
        System.out.println("SMS sent");
    }
}
