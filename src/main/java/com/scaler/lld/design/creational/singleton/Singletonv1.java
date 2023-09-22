package com.scaler.lld.design.creational.singleton;

public class Singletonv1 {
    private Singletonv1(){}
    private static Singletonv1 instance=new Singletonv1();
    public static Singletonv1 getInstance(){
        return instance;
    }

    //eager initiliazation
    //why static --> as private constructor so method has to be called from outside
    // why static variable --> as that method is using variable so static variable.
    //at class load--> instance is getting created so eager init.

}
