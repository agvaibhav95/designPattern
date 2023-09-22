package com.scaler.lld.design.behavioural.strategy.V4;

public class CarStrategy implements NavigationStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by car from "+from+" to "+to);
    }
}
