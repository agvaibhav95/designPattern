package com.scaler.lld.design.creational;

import com.scaler.lld.design.creational.abstractFactory.ThemeFactory;
import com.scaler.lld.design.creational.abstractFactory.impl.DarkThemeFactory;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.checkBox;
import com.scaler.lld.design.creational.models.impl.DarkCheckBox;
import com.scaler.lld.design.creational.models.impl.RoundButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractFactory {
    private ThemeFactory themeFactory;


    @Before
    public void setUp(){
        themeFactory=new DarkThemeFactory();
    }
    @Test
    public void getTheme(){
        checkBox darkCheckBox=themeFactory.getCheckBox();
        Button roundButton=themeFactory.getButton();
        Assert.assertTrue(darkCheckBox instanceof DarkCheckBox && roundButton instanceof RoundButton);

    }
}
