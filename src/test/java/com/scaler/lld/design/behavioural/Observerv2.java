package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;
import com.scaler.lld.design.behavioural.observer.model.EmailSenderService;
import com.scaler.lld.design.behavioural.observer.model.SMSSender;
import com.scaler.lld.design.behavioural.observer.model.v2.BitcoinPoller;
import com.scaler.lld.design.behavioural.observer.model.v2.BitcoinTracker;
import org.junit.Test;

public class Observerv2 {
    @Test
    public void notifyUser(){
        BitcoinTracker bitcoinTracker=new BitcoinTracker(new Bitcoin(10));
        BitcoinPoller bitcoinPoller=new BitcoinPoller(bitcoinTracker,new EmailSenderService(),new SMSSender());
        bitcoinPoller.poll();

    }
}
