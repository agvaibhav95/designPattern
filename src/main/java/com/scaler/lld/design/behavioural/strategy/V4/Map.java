package com.scaler.lld.design.behavioural.strategy.V4;

import lombok.Setter;

@Setter
// why setter bcoz we can change strategy at runtime from car--> bike
public class Map {
    private NavigationStrategy navigationStrategy;
    public Map(NavigationStrategy navigationStrategy){
        this.navigationStrategy=navigationStrategy;
    }
    public void navigate(String from,String to){
        navigationStrategy.navigate(from,to);
    }
}
