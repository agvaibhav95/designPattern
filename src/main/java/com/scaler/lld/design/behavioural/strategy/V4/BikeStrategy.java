package com.scaler.lld.design.behavioural.strategy.V4;

public class BikeStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by bike from "+from+" to "+to);
    }
}
