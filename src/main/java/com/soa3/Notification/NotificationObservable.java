package com.soa3.Notification;

import java.util.ArrayList;

public abstract class NotificationObservable {

    ArrayList<NotificationObserver> observers = new ArrayList<NotificationObserver>();

    public void addObserver(NotificationObserver newObserver) {
        observers.add(newObserver);
    }

    public void deleteObserver(NotificationObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(String message){
        for (NotificationObserver o: observers) {
            o.update(message);
        }
    }
}
