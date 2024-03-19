package com.soa3.Backlog;

import com.soa3.Person.Person;

public class Activity {

    private Person person;
    private final String title;
    private boolean isDone = false;

    public Activity(Person person, String title) {
        this.person = person;
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
