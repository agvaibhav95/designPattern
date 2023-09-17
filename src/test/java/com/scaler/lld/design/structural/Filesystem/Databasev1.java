package com.scaler.lld.design.structural.Filesystem;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.v1.DatabaseServiceV1;
import org.junit.Assert;
import org.junit.Test;

public class Databasev1 {

    @Test
    public void read(){
        DatabaseServiceV1 databaseServiceV1=new DatabaseServiceV1();
        String s=databaseServiceV1.read();
        Assert.assertEquals("hi",s);
    }

    @Test

    public void write(){
        DatabaseServiceV1 databaseServiceV1=new DatabaseServiceV1();
        databaseServiceV1.write("hi");
        //Assert.assertEquals("hi",s);
    }
}
