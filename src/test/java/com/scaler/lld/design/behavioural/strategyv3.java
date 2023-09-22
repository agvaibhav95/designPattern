package com.scaler.lld.design.behavioural;

import com.scaler.lld.design.behavioural.strategy.V3.BikeNavigator;
import com.scaler.lld.design.behavioural.strategy.V3.CarNavigator;
import com.scaler.lld.design.behavioural.strategy.V3.FootNavigator;
import com.scaler.lld.design.behavioural.strategy.V3.Map;
import org.junit.Before;
import org.junit.Test;

public class strategyv3 {
    private Map map;

    @Test
    public void navigateByCar(){
        map=new CarNavigator();
        map.navigate("gzb","ggn");
    }

    @Test
    public void navigateByBike(){
        map=new BikeNavigator();
        map.navigate("gzb","ggn");
    }

    @Test
    public void navigateByFoot(){
        map=new FootNavigator();
        map.navigate("gzb","ggn");
    }

    @Test
    public void checkStaticWorkInInheritance(){
        map=new FootNavigator();
        map.navigate("gzb","ggn");
        //(new BikeNavigator())map;
        // i cannot type cast map obj to bike
        //thats why this is static
        //in composition we will see we will use single map class
    }
}
