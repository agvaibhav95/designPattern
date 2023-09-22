package com.scaler.lld.design.behavioural.observer.model.v3.impl;

import com.scaler.lld.design.behavioural.observer.model.v3.Observer;

public class SmsSender implements Observer {
    @Override
    public void notifyUser() {
        System.out.println("SMS sent");
    }
}
