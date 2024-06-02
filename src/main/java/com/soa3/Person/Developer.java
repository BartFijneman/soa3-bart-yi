package com.soa3.Person;

public class Developer implements Person{

    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return "Developer: " + name;
    }
}
