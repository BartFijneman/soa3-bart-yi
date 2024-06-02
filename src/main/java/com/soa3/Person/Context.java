package com.soa3.Person;

public class Context {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void showPersonDetails() {
        if (person != null) {
            System.out.println(person.getName());
        } else {
            System.out.println("No person is set.");
        }
    }
}
