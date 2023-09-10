package com.scaler.lld.design.creational;
import com.scaler.lld.design.creational.Constant.ButtonType;
import com.scaler.lld.design.creational.models.Button;

import com.scaler.lld.design.creational.models.impl.PrimaryButton;
import com.scaler.lld.design.creational.simple.ButtonFactory;
import org.junit.Assert;
import org.junit.Test;

public class simpleFactory {

    @Test
    public void getButton(){
        Button primaryButton= ButtonFactory.getButton(ButtonType.PRIMARY);
        Assert.assertTrue(primaryButton instanceof PrimaryButton);
    }
}
