package com.scaler.lld.design.structural.decorator.notification.FileSystem.v3;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class CompressionDatabase extends DatabaseDecorator{

    public CompressionDatabase(Database database){
        super(database);
    }
    @Override
    public String read() {
        String s=database.read();
        System.out.println("decompressing database which is read from db which is "+s);
        return "DecompressedHi";
    }

    @Override
    public void write(String str) {
    System.out.println("compressed string"+str);
    database.write(str);
    }
}
