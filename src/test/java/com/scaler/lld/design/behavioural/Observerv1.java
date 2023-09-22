package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.observer.model.Bitcoin;
import com.scaler.lld.design.behavioural.observer.model.v1.BitcoinManagerv1;
import org.junit.Assert;
import org.junit.Test;

public class Observerv1 {
    @Test
    public void sendMsg(){
        BitcoinManagerv1 bitcoinManagerv1=new BitcoinManagerv1(new Bitcoin());
        bitcoinManagerv1.setPrice(10);

    }
}
