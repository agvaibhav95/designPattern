package com.scaler.lld.design.structural.decorator.notification.FileSystem.v1;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public class DatabaseServiceV1 implements Database {
    @Override
    public String read() {

      //  return "Hey";
        return decrypt(decompress("hi"));
    }

    @Override
    public void write(String str) {

        System.out.println("written in db "+encrypt(compress(str)));

    }
    //now if i want to ecrypt and compress this database file while writing

    // and decompres and decrypt while reading
    private String decompress(String s){
        System.out.println("string decompress");
        return s;
    }

    private String decrypt(String s){
        System.out.println("string decrypted");
        return s;
    }

    private String compress(String s){
        System.out.println("string compress");
        return s;
    }

    private String encrypt(String s){
        System.out.println("string encrypted");
        return s;
    }

    //drawback srp voilated
    // and tomorow if i want to implement some other algo fr password encryption
    //then OCP voilate

}
