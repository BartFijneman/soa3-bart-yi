package com.soa3.Notification.Adapter;

import com.soa3.Notification.NotificationType;

public class SMSNotificationAdapter implements NotificationType {
    private SMS sms;

    public SMSNotificationAdapter(SMS sms) {
        this.sms = sms;
    }

    @Override
    public void sendNotification(String message) {
        sms.sendSMS(message);
    }
}