package com.soa3.Notification;

public class SlackObserver implements NotificationObserver {

    private NotificationObservable observable;
    private String message;

    public SlackObserver(NotificationObservable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void update(String message) {
        this.message = message;
        display();
    }

    private void display(){
        System.out.println("Slack: " + message);
    }

    public NotificationObservable getObservable() {
        return observable;
    }

    public String getMessage() {
        return message;
    }
}
