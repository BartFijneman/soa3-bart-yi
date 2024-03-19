package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;
import com.soa3.Notification.EmailObserver;

public class DoneState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public DoneState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;

        // new message to testers
        new EmailObserver(this.backlogItem);
        this.backlogItem.notifyObservers("Ready for testing");
    }

    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Item completed");
    }

    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Item completed");
    }

    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Item completed");
    }

    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Item completed");
    }

    public BacklogItemState toTested() throws Exception {
        throw new Exception("Item completed");
    }

    public BacklogItemState toDone() throws Exception {
        throw new Exception("Item completed");
    }
}
