package com.scaler.lld.design.structural.decorator.notification.FileSystem.v2;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class DatabaseServicev2 implements Database {

    @Override
    public String read() {
        return "hi";
    }

    @Override
    public void write(String str) {
System.out.println("written in db"+str);
    }
    //extracting encryotion and compression in other class
    // class explosion
}
