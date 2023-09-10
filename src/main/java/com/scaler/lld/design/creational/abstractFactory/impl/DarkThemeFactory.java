package com.scaler.lld.design.creational.abstractFactory.impl;

import com.scaler.lld.design.creational.abstractFactory.ThemeFactory;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.checkBox;
import com.scaler.lld.design.creational.models.impl.DarkCheckBox;
import com.scaler.lld.design.creational.models.impl.RoundButton;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button getButton() {
        return new RoundButton();
    }

    @Override
    public checkBox getCheckBox() {
        return new DarkCheckBox();
    }
}
