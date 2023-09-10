package com.scaler.lld.design.creational.abstractFactory.impl;

import com.scaler.lld.design.creational.abstractFactory.ThemeFactory;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.checkBox;
import com.scaler.lld.design.creational.models.impl.LightCheckBox;
import com.scaler.lld.design.creational.models.impl.PrimaryButton;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button getButton() {
        return new PrimaryButton();
    }

    @Override
    public checkBox getCheckBox() {
        return new LightCheckBox();
    }
}
