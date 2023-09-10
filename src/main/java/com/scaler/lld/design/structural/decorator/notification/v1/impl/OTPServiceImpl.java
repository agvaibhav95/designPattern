package com.scaler.lld.design.structural.decorator.notification.v1.impl;

import com.scaler.lld.design.structural.decorator.notification.Notifier;
import com.scaler.lld.design.structural.decorator.notification.OTPService;

public class OTPServiceImpl implements OTPService {
    private Notifier EmailNotifier;
    private Notifier SMSNotifier;
    private Notifier SlackNotifier;
    @Override
    public void sendOTP() {
EmailNotifier.sendMessage();
SMSNotifier.sendMessage();
SlackNotifier.sendMessage();
//suppose tomorrow one  more channel come than we have to add that here as well. OCP voilation
        // suppose tomorrow one more class say highAlertService which also need to send notification to all channels.
        // then code duplicaiton problem
        
    }
}
