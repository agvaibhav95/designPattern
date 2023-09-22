package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;
import com.scaler.lld.design.behavioural.observer.model.v3.Observable;
import com.scaler.lld.design.behavioural.observer.model.v3.Observer;
import com.scaler.lld.design.behavioural.observer.model.v3.impl.BitcoinTracker;
import com.scaler.lld.design.behavioural.observer.model.v3.impl.EmailSender;
import com.scaler.lld.design.behavioural.observer.model.v3.impl.SmsSender;
import org.junit.Test;

public class Observerv3 {
    @Test
    public void sendMsg(){
        BitcoinTracker observable=new BitcoinTracker(new Bitcoin(1));
        Observer emailSender=new EmailSender();
        Observer sms=new SmsSender();
        observable.addObservers(emailSender);
        observable.addObservers(sms);
        observable.setPrice(10);
    }
}
