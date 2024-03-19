package com.soa3.Forum;

import com.soa3.Backlog.BacklogItem;
import com.soa3.Person.Person;

import java.util.ArrayList;
import java.util.List;

public class ForumThread {

    private final BacklogItem backlogItem;

    private final List<ThreadComment> comments;

    private final Person startedBy;

    public ForumThread(BacklogItem backlogItem, Person startedBy) {
        this.backlogItem = backlogItem;
        this.comments = new ArrayList<ThreadComment>();
        this.startedBy = startedBy;
    }

    public List<ThreadComment> getComments() {

        return comments;
    }

    public void addComment(ThreadComment reaction){

        comments.add(reaction);
    }

    public Person getStartedBy() {
        return startedBy;
    }

    public BacklogItem getBacklogItem() {
        return backlogItem;
    }
}
