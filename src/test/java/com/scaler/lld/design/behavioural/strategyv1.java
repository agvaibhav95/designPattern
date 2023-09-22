package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.strategy.V1.Map;
import org.junit.Before;
import org.junit.Test;

public class strategyv1 {
    private Map map;

    @Before
    public void setup(){
        map=new Map();
    }

    @Test
    public void navigateByCar(){
        map.navigateByCar("gzb","ggn");
    }

    @Test
    public void navigateByBike(){
        map.navigateByBike("gzb","ggn");
    }

    @Test
    public void navigateByFoot(){
        map.navigateByFoot("gzb","ggn");
    }
}
