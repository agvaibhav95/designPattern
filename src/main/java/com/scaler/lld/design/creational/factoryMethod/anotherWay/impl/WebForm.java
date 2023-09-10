package com.scaler.lld.design.creational.factoryMethod.anotherWay.impl;

import com.scaler.lld.design.creational.factoryMethod.anotherWay.Form;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.impl.PrimaryButton;

public class WebForm implements Form {
    @Override
    public Button getButton() {
        return new PrimaryButton();
    }
}
