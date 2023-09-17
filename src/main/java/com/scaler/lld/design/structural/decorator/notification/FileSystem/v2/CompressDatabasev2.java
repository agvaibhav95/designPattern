package com.scaler.lld.design.structural.decorator.notification.FileSystem.v2;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class CompressDatabasev2 implements Database {
    @Override
    public String read() {
    String s=readFromDb();
    return decompress(s);

    }

    @Override
    public void write(String str) {

    writeInDb(compress(str));
    }
    private String compress(String s){
        System.out.println("string compressed"+s);
        return s;
    }
    private String decompress(String s){
        System.out.println("string decompressed"+s
        );
        return s;
    }
    private String readFromDb(){
        return "Hi";
    }
    private void writeInDb(String s){
        System.out.println("data saved in db"+s);
    }
    // now how i can do both encryption and compression
}
