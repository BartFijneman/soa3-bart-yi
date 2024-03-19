package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;

public class TestedState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public TestedState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;
    }

    public BacklogItemState toToDo() throws Exception {
        return new ToDoState(this.backlogItem);
    }

    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Can't go to doing");
    }

    public BacklogItemState toReadyForTesting() throws Exception {
        return new ReadyForTestingState(this.backlogItem);
    }

    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Already testing");
    }

    public BacklogItemState toTested() throws Exception {
        throw new Exception("Already tested");
    }

    public BacklogItemState toDone() throws Exception {
        return new DoneState(this.backlogItem);
    }
}
