package com.soa3.Person;

public class ScrumMaster implements Person{

    private final String name;

    public ScrumMaster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
