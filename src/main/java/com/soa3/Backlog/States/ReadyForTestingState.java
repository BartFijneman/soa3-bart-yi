package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;
import com.soa3.Notification.EmailObserver;

public class ReadyForTestingState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public ReadyForTestingState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;

        // new message to testers
        new EmailObserver(this.backlogItem);
        this.backlogItem.notifyObservers("Ready for testing");
    }

    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Already picked");
    }

    public BacklogItemState toDoing() throws Exception {
        return new DoingState(this.backlogItem);
    }

    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Already in ready for testing");
    }

    public BacklogItemState toTesting() {
        return new TestingState(this.backlogItem);
    }

    public BacklogItemState toTested() throws Exception {
        throw new Exception("First complete tests");
    }

    public BacklogItemState toDone() throws Exception {
        throw new Exception("First complete tests");
    }

}
