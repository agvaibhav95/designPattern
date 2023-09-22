package com.scaler.lld.design.behavioural.strategy.V4;

public class FootStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        System.out.println("travelling by foot from "+from+" to "+to);
    }
}
