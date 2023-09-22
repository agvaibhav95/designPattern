package com.scaler.lld.design.behavioural.strategy.V2;

public class Map {
    public void navigate(String from,String to,NavigationTypes navigationTypes){
        switch (navigationTypes){
            case CAR:
                 System.out.println("travelling by car from "+from+" to "+to);
                return;
            case BIKE:
                System.out.println("travelling by BIKE from "+from+" to "+to);
                return;
            case FOOT:
                System.out.println("travelling by FOOT from "+from+" to "+to);
                return;
        }
        throw new IllegalArgumentException("Invalid NAVIGATION TYPES");

    }
}

//ocp ,srp ,maintainablity,testing issues
