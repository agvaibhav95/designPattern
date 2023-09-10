package com.scaler.lld.design.creational;

import com.scaler.lld.design.creational.factoryMethod.tradiational.impl.PrimaryButtonFactory;
import com.scaler.lld.design.creational.models.Button;
import com.scaler.lld.design.creational.models.impl.PrimaryButton;
import org.junit.Assert;
import org.junit.Test;

public class TraditionalFactoryMethod {
    @Test
    public void getButtton(){
        Button primaryButton=new PrimaryButtonFactory().getButton();
        Assert.assertTrue(primaryButton instanceof PrimaryButton);

    }
}
