package com.scaler.lld.design.structural.decorator.notification.FileSystem.v3;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;
import com.scaler.lld.design.structural.decorator.notification.FileSystem.v2.EncryptionDatabasev2;

public class EncryptionDatabase extends DatabaseDecorator{

    public EncryptionDatabase(Database database){
        super(database);
    }
    @Override
    public String read() {
        String s=database.read();
        System.out.println("decrypting string which is read from db which is "+s);
        return "DeEncryptedHi";
    }

    @Override
    public void write(String str) {
        System.out.println("encrypted string is "+str);
        database.write(str);
    }
}
