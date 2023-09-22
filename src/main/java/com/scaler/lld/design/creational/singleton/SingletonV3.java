package com.scaler.lld.design.creational.singleton;

public class SingletonV3 {
    private SingletonV3(){}
    private static SingletonV3 instance=null;
    public synchronized static SingletonV3 getInstance(){
        if(instance == null){
            instance=new SingletonV3();
        }
        return instance;
    }
}
