package com.scaler.lld.design.creational.factoryMethod.tradiational;

import com.scaler.lld.design.creational.models.Button;

public interface ButtonFactory {
    // cons of simple factory is srp and ocp now we have moved that code in diff classes no need to open button factory
    //whenever there we need to add a new type
    //create a factory of that type and use it.
    // class explosion --cons
    //here creating class is not factory method but getButton() method is factory method
    //each subclass has its own implementation
    public Button getButton();
}
