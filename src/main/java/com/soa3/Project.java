package com.soa3;

import com.soa3.Backlog.Backlog;
import com.soa3.Person.Person;
import com.soa3.Sprint.Sprint;

import java.util.List;

public class Project {

    private final int id;
    private final String name;
    private final Backlog backlog;
    private final Person productOwner;
    private List<Sprint> sprints;

    public Project(String name, int id, Person productOwner) {
        this.name = name;
        this.id = id;
        this.backlog = new Backlog(this);
        this.productOwner = productOwner;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Backlog getBacklog() {

        return backlog;
    }

    public Person getProductOwner() {
        return productOwner;
    }

    public List<Sprint> getSprints() {
        return this.sprints;
    }

}
