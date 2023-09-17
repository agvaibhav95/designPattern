package com.scaler.lld.design.structural.decorator.notification.FileSystem.v3;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class DatabaseServiceV3 implements Database {
    @Override
    public String read() {
        return "Hi";
    }

    @Override
    public void write(String str) {
System.out.println("data save in db"+str);
    }
}
