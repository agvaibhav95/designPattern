package com.scaler.lld.design.structural.decorator.notification.FileSystem.v2;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class EncryptionDatabasev2 implements Database {
    @Override
    public String read() {
        String s=readFromDB();
        return decrypt(s);
    }

    @Override
    public void write(String str) {
    writeInDB(encrypt(str));
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
}
