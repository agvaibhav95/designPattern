package com.scaler.lld.design.creational.factoryMethod.anotherWay.impl;

import com.scaler.lld.design.creational.factoryMethod.anotherWay.Form;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.impl.RoundButton;

public class MobileForm implements Form {
    @Override
    public Button getButton() {
        return new RoundButton();
    }
}
