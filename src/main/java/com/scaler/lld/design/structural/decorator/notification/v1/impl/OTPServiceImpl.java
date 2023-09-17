package com.scaler.lld.design.structural.decorator.notification.v1.impl;

import com.scaler.lld.design.structural.decorator.notification.Notifier;
import com.scaler.lld.design.structural.decorator.notification.OTPService;

public class OTPServiceImpl implements OTPService {

   // private Notifier SlackNotifier;Override
    @Override
    public void sendOTP() {
        EmailNotification emailNotification=new EmailNotification();
emailNotification.sendMessage();
SmsNotification smsNotification=new SmsNotification();
smsNotification.sendMessage();

//can i change the sms to push -> SRP voilates and OCP voilate
//suppose tomorrow one  more channel come than we have to add that here as well. OCP voilation
        // suppose tomorrow one more class say highAlertService which also need to send notification to all channels.
        // then code duplicaiton problem
        //we can add in email class also -->leads to SRP and OCP violations


        //and tomorow say push notification also we need to send means apart from slack user should be notified
        //on all channels.
        //then v2 disadv--> OCP voilation


    }
}
