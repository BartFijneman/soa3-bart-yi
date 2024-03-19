package com.soa3.Notification;

public class EmailObserver implements NotificationObserver {

    private NotificationObservable observable;
    private String message;

    public EmailObserver(NotificationObservable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public NotificationObservable getObservable() {
        return observable;
    }

    public String getMessage() {
        return message;
    }

    public void update(String message) {
        this.message = message;
        display();
    }

    private void display(){
        System.out.println("Email: " + message);
    }
}
