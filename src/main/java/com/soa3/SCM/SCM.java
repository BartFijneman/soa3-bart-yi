package com.soa3.SCM;

public interface SCM {
    void push();

    void commit(String m);

    void branch(String name);

    void pull();

}
