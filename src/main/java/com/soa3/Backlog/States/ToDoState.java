package com.soa3.Backlog.States;

public class ToDoState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() throws Exception {
        // Already in ToDo state, no transition needed
        throw new Exception("Already in ToDo state");
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        context.changeState(new DoingState());
        return context.state;
    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Transition from ToDo to ReadyForTesting is not allowed");
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Transition from ToDo to Testing is not allowed");
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        throw new Exception("Transition from ToDo to Tested is not allowed");
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        throw new Exception("Transition from ToDo to Done is not allowed");
    }
}
