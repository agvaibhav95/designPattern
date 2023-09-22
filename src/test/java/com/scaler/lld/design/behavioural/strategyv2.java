package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.strategy.V2.Map;
import com.scaler.lld.design.behavioural.strategy.V2.NavigationTypes;
import org.junit.Before;
import org.junit.Test;

public class strategyv2 {
    private Map map;
    @Before
    public void setup(){
        map=new Map();
    }
    @Test
    public void navigateByCar(){
        map.navigate("gzb","ggn", NavigationTypes.CAR);
    }

    @Test
    public void navigateByBike(){
        map.navigate("gzb","ggn",NavigationTypes.BIKE);
    }

    @Test
    public void navigateByFoot(){
        map.navigate("gzb","ggn",NavigationTypes.FOOT);
    }
}
