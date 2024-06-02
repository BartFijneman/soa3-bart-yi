package com.soa3.Notification.Adapter;

import com.soa3.Notification.NotificationType;

public class EmailNotificationAdapter implements NotificationType {
    private Email email;

    public EmailNotificationAdapter(Email email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        email.sendEmail(message);
    }
}