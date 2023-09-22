package com.scaler.lld.design.behavioural.strategy.V3;

public class BikeNavigator implements Map{
    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by bike from "+from+" to "+to);
    }
}
