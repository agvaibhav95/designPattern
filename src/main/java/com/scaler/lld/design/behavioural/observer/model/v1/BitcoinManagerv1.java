package com.scaler.lld.design.behavioural.observer.model.v1;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;
import com.scaler.lld.design.behavioural.observer.model.EmailSenderService;
import com.scaler.lld.design.behavioural.observer.model.NotificationService;
import com.scaler.lld.design.behavioural.observer.model.SMSSender;

public class BitcoinManagerv1 {
    private Bitcoin bitcoin;


    public BitcoinManagerv1(Bitcoin bitcoin){
        this.bitcoin=bitcoin;
    }
    public void setPrice(int price){
        bitcoin.setPrice(price);
        NotificationService smsSender=new SMSSender();
        smsSender.sendMsg();
        NotificationService emailSenderService=new EmailSenderService();
        emailSenderService.sendMsg();

    }

    //srp and ocp voilaion
}
