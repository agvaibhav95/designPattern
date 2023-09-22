package com.scaler.lld.design.behavioural.observer.model.v2;

import com.scaler.lld.design.behavioural.observer.model.EmailSenderService;
import com.scaler.lld.design.behavioural.observer.model.SMSSender;

public class BitcoinPoller {
    private BitcoinTracker bitcoinTracker;
    private int previousPrice;
    private EmailSenderService emailSenderService;
    private SMSSender smsSender;

    public BitcoinPoller(BitcoinTracker bitcoinTracker,EmailSenderService emailSenderService,SMSSender smsSender){
        this.bitcoinTracker=bitcoinTracker;
        this.emailSenderService=emailSenderService;
        this.smsSender=smsSender;
    }

    public void poll(){
        if(this.previousPrice!=bitcoinTracker.getBitcoin().getPrice()){
            this.previousPrice=bitcoinTracker.getBitcoin().getPrice();
            emailSenderService.sendMsg();
            smsSender.sendMsg();
        }
    }
    //this is wasteful as we are polling tracker as we are asking shopkeeper is mobile launched
    // we dont know when price will get change so when to poll afer 1sec 1min or 1hr

}
