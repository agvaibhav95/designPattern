package com.scaler.lld.design.creational.abstractFactory;

import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.checkBox;

public interface ThemeFactory {
    // here we have a related type of products
    //suppose chairA with tableA will go not with tableB so we have to stop this cretion
    public Button getButton();
    public checkBox getCheckBox();
}
