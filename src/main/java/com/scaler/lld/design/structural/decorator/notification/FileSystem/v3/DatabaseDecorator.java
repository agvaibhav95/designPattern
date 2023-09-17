package com.scaler.lld.design.structural.decorator.notification.FileSystem.v3;

import com.scaler.lld.design.structural.decorator.notification.FileSystem.Database;

public abstract class DatabaseDecorator implements Database {
    protected Database database;

    DatabaseDecorator(Database database){
        this.database=database;
    }
}
