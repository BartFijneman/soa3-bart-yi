package com.soa3.Forum;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumThread> threads;

    public Forum() {

        this.threads = new ArrayList<ForumThread>();
    }

    public void createThread(ForumThread thread){

        threads.add(thread);
    }

    public List<ForumThread> getThreads() {

        return threads;
    }

}
