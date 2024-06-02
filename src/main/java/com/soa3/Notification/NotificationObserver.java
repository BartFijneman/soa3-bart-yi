package com.soa3.Notification;

public class NotificationObserver implements Observer {
    private NotificationType notificationType;

    public NotificationObserver(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public void update(String message) {
        notificationType.sendNotification(message);
    }
}
