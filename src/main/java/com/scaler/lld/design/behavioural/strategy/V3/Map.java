package com.scaler.lld.design.behavioural.strategy.V3;

public interface Map {
    public void navigate(String from,String to);
}


//code duplicacy
//inheritance is static which means we cannot change from car to bike at rumtime
// we have to use composition then