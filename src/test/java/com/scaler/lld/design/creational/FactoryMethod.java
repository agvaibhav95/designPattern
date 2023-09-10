package com.scaler.lld.design.creational;

import com.scaler.lld.design.creational.factoryMethod.anotherWay.Form;
import com.scaler.lld.design.creational.factoryMethod.anotherWay.impl.MobileForm;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.impl.RoundButton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryMethod {
    private Form form;

    @Before
    public void setUp(){
        form=new MobileForm();
    }

    @Test
    public void getButton(){
        Button roundButton=form.getButton();
        Assert.assertTrue(roundButton instanceof RoundButton
        );
    }
}
