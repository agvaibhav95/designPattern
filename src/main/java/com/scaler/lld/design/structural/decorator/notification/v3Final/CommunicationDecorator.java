package com.scaler.lld.design.structural.decorator.notification.v3Final;

import com.scaler.lld.design.structural.decorator.notification.Notifier;

public abstract class CommunicationDecorator implements Notifier {
    // why i am implemention this??
    //bcoz we have extracted all common methods to notifier and we need some parent class for reference so that we can
    //pass that reference to every class
    //why abstract??
    //bcoz can i implement read and write in my base decorator class --> no every class will have its own so make it abstarct.
    protected Notifier notifier;

    public CommunicationDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

}
