package com.scaler.lld.design.behavioural.observer.model.v3;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers=new ArrayList<>();
    public  void sendNotification(){
        for (Observer observer:observers){
            observer.notifyUser();
        }
    }
    public void addObservers(Observer observer){
        this.observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }
    //here we will get null pointer exception if we dont initialize them so we are registring and degestring
}
