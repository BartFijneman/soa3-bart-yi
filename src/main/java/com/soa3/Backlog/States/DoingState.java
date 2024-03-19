package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;

public class DoingState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public DoingState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;
    }

    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Already picked");
    }

    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Already in doing");
    }

    public BacklogItemState toReadyForTesting() {
        return new ReadyForTestingState(this.backlogItem);
    }

    public BacklogItemState toTesting() throws Exception {
        throw new Exception("First complete tests");
    }

    public BacklogItemState toTested() throws Exception {
        throw new Exception("First complete testing");
    }

    public BacklogItemState toDone() throws Exception {
        throw new Exception("First complete tested");
    }

}
