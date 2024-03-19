package com.soa3.Backlog;

import com.soa3.Project;

import java.util.ArrayList;
import java.util.List;

public class Backlog {

    private final List<BacklogItem> backlogItems;
    private final Project project;

    public Backlog(Project project) {

        this.backlogItems = new ArrayList<BacklogItem>();
        this.project = project;
    }

    public List<BacklogItem> getBacklogItems() {

        return backlogItems;
    }

    public void add(BacklogItem backlogItem){

        backlogItems.add(backlogItem);
        backlogItem.setBacklog(this);
    }
}
