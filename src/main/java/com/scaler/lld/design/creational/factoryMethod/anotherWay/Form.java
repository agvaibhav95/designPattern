package com.scaler.lld.design.creational.factoryMethod.anotherWay;

import com.scaler.lld.design.creational.models.Button;

public interface Form {

    //this getButton() method is factory method we can use in the form class also as this saves creating
    //extra classes which was there in traditional way



    public Button getButton();

}
