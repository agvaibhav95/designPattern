package com.scaler.lld.design.behavioural.observer.model.v2;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;

public class BitcoinTracker {
    private Bitcoin bitcoin;


    public BitcoinTracker(Bitcoin bitcoin){
        this.bitcoin=bitcoin;
    }
    public void setPrice(int price){
        this.bitcoin.setPrice(price);
    }
    public Bitcoin getBitcoin(){
        return this.bitcoin;
    }
}
