package com.scaler.lld.design.behavioural.strategy.V3;

public class CarNavigator implements Map{
    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by car from "+from+" to "+to);
    }
}
