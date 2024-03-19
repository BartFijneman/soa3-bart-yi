package com.soa3.SCM;

public class Github implements SCM {


    @Override
    public void push() {
        System.out.println("push");
    }

    @Override
    public void commit(String m) {
        System.out.println("commit "+m);
    }

    @Override
    public void branch(String name) {
        System.out.println("branch "+ name);
    }

    @Override
    public void pull() {
        System.out.println("pull");
    }
}
