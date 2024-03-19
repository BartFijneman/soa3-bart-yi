package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;

public class ToDoState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public ToDoState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;
    }

    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Already a todo");
    }

    public BacklogItemState toDoing() {
        return new DoingState(this.backlogItem);
    }

    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("First complete doing");
    }

    public BacklogItemState toTesting() throws Exception {
        throw new Exception("First complete tests");
    }

    public BacklogItemState toTested() throws Exception {
        throw new Exception("First complete tests");
    }

    public BacklogItemState toDone() throws Exception {
        throw new Exception("First complete tests");
    }

}
