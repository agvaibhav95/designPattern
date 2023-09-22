package com.scaler.lld.design.behavioural.strategy.V1;

public class Map {
    public void navigateByCar(String from,String to){
        System.out.println("travelling by car from "+from+" to "+to);

    }
    public void navigateByBike(String from,String to){
        System.out.println("travelling by bike from "+from+" to "+to);
    }
    public void navigateByFoot(String from,String to){
        System.out.println("travelling by foot from "+from+" to "+to);
    }

    //srp and ocp voilates and maintainablity issues
    //testing issues
}
