package com.soa3.Forum;

import com.soa3.Person.Person;

public class ThreadComment {

    private final String message;

    private final Person person;

    public ThreadComment(String message, Person person) {
        this.message = message;
        this.person = person;
    }

}
