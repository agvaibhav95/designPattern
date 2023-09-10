package com.scaler.lld.design.creational.factoryMethod.tradiational.impl;

import com.scaler.lld.design.creational.factoryMethod.tradiational.ButtonFactory;
import com.scaler.lld.design.creational.models.impl.RoundButton;
import com.scaler.lld.design.creational.models.Button;

public class RoundButtonFactory implements ButtonFactory {
    @Override
    public Button getButton() {
        return new RoundButton();
    }
}
