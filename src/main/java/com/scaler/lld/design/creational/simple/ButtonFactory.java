package com.scaler.lld.design.creational.simple;

import com.scaler.lld.design.creational.Constant.ButtonType;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.impl.PrimaryButton;
import com.scaler.lld.design.creational.models.impl.RoundButton;

public class ButtonFactory {
    //single class with static method based on type return different types of button
    //SRP , OCP voilates as single class responsible for object creation
    // construction logic at single place --pros
    //if we need to pass the paramter of buttons then we have to pass dto object which might be polluted.
    public static Button getButton(ButtonType type) {
        switch (type) {
            case PRIMARY:
                return new PrimaryButton();

            case ROUND:
                return new RoundButton();


        }
        throw new IllegalArgumentException("Invalid Button");
    }

}
