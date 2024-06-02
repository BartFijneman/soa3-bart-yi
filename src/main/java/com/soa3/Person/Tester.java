package com.soa3.Person;

public class Tester implements Person{

    private final String name;

    public Tester(String name) {
        this.name = name;
    }

    public String getName() {
        return "Tester: " + name;
    }
}
