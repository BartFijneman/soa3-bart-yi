package com.soa3.Person;

public class ProductOwner implements Person {

    private final String name;

    public ProductOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
