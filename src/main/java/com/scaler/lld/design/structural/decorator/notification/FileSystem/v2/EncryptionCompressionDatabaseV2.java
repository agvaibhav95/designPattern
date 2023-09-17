package com.scaler.lld.design.structural.decorator.notification.FileSystem.v2;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class EncryptionCompressionDatabaseV2 implements Database {
    @Override
    public String read() {
        String s=readFromDB();
        return decrypt(decompress(s));
    }

    @Override
    public void write(String str) {
        writeInDB(
        compress(encrypt(str)));
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
    private String readFromDB(){
        return "Hi";
    }
    private String decrypt(String s){
        System.out.println("String decrypted");
        return s;
    }

    private void writeInDB(String s){
        System.out.println("saved in db"+s);
    }
    private String encrypt(String s){
        System.out.println("String encrypted");
        return s;
    }
    //tying behaviour to class --> CLASS EXPLOSION
}
