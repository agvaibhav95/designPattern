package com.scaler.lld.design.behavioural.strategy.V3;

public class FootNavigator implements Map{
    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by foot from "+from+" to "+to);
    }
}
