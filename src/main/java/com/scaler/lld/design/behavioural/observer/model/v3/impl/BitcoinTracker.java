package com.scaler.lld.design.behavioural.observer.model.v3.impl;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;
import com.scaler.lld.design.behavioural.observer.model.v3.Observable;

public class BitcoinTracker extends Observable {
    private Bitcoin bitcoin;
    public BitcoinTracker(Bitcoin bitcoin){
        this.bitcoin=bitcoin;
    }
    public void setPrice(int price){
        this.bitcoin.setPrice(price);
        sendNotification();
    }

}
