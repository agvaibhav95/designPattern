package com.scaler.lld.design.structural.Filesystem;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;
import com.scaler.lld.design.structural.decorator.notification.FileSystem.v3.CompressionDatabase;
import com.scaler.lld.design.structural.decorator.notification.FileSystem.v3.DatabaseServiceV3;
import com.scaler.lld.design.structural.decorator.notification.FileSystem.v3.EncryptionDatabase;
import org.junit.Assert;
import org.junit.Test;

public class DatabaseV3 {
    @Test
    public void encrypt(){
        Database database=new DatabaseServiceV3();
        EncryptionDatabase encryptionDatabase=new EncryptionDatabase(database);
        encryptionDatabase.write("Hi");
    }
    @Test
    public void compress(){
        Database database=new DatabaseServiceV3();
        CompressionDatabase compressionDatabase=new CompressionDatabase(database);
        compressionDatabase.write("Hi");
    }
    @Test
    public void decrypt(){
        Database database=new DatabaseServiceV3();
        EncryptionDatabase encryptionDatabase=new EncryptionDatabase(database);
       Assert.assertEquals("DeEncryptedHi",encryptionDatabase.read());
    }
    @Test
    public void decompress(){
        Database database=new DatabaseServiceV3();
        CompressionDatabase compressionDatabase=new CompressionDatabase(database);
        Assert.assertEquals("DecompressedHi",compressionDatabase.read());
    }
    @Test
    public void deencryptDeCompress(){
        Database database=new DatabaseServiceV3();

        CompressionDatabase compressionDatabase=new CompressionDatabase(database);
        EncryptionDatabase encryptionDatabase=new EncryptionDatabase(compressionDatabase);
        Assert.assertEquals("DeEncryptedHi",encryptionDatabase.read());

    }
    @Test
    public void EncryptCompress(){
        Database database=new DatabaseServiceV3();
        CompressionDatabase compressionDatabase=new CompressionDatabase(database);
        EncryptionDatabase encryptionDatabase=new EncryptionDatabase(compressionDatabase);

        encryptionDatabase.write("Hi");
    }
}
