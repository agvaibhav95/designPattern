package com.scaler.lld.design.creational.singleton;

public class Singletonv2 {
    private static Singletonv2 instance=null;
    private Singletonv2(){}
    public static Singletonv2 getInstance(){
        if(instance == null){
            instance=new Singletonv2();
        }
        return instance;
    }


    // as we need on demand initialization when method is called.
    //thread safety issues
    //srp voiation

}
