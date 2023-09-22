package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.strategy.V2.NavigationTypes;
import com.scaler.lld.design.behavioural.strategy.V4.BikeStrategy;
import com.scaler.lld.design.behavioural.strategy.V4.CarStrategy;
import com.scaler.lld.design.behavioural.strategy.V4.FootStrategy;
import com.scaler.lld.design.behavioural.strategy.V4.Map;
import org.junit.Before;
import org.junit.Test;

public class strategyv4 {
    private Map map;
    @Before
    public void setUp(){
        map=new Map(new CarStrategy());
    }
    @Test
    public void navigateByCar(){
        map.navigate("gzb","ggn" );
    }

    @Test
    public void navigateByBike(){

        map.setNavigationStrategy(new BikeStrategy());
        map.navigate("gzb","ggn");
    }

    @Test
    public void navigateByFoot(){
        map.setNavigationStrategy(new FootStrategy());
        map.navigate("gzb","ggn");
    }

    @Test
    public void howDynamicIsCompostion(){
        map.navigate("gzb","ggn");
        map.setNavigationStrategy(new FootStrategy());
        map.navigate("gzb","ggn");
        map.setNavigationStrategy(new BikeStrategy());
        map.navigate("gzb","ggn");
    }
}
