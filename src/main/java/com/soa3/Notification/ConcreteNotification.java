package com.soa3.Notification;

public class ConcreteNotification extends NotificationObservable {
    private String message;

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers(message);
    }

    public String getMessage() {
        return message;
    }
}