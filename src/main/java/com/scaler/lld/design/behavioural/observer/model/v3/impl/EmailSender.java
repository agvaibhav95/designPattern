package com.scaler.lld.design.behavioural.observer.model.v3.impl;

import com.scaler.lld.design.behavioural.observer.model.v3.Observer;

public class EmailSender implements Observer {
    @Override
    public void notifyUser() {

        System.out.println("Email sent");
    }
}
