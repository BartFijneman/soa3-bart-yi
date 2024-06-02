package com.soa3.Backlog.States;

public class DoingState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() throws Exception {
        // Transition from Doing to ToDo
        context.changeState(new ToDoState());
        return context.state;
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        // Already in Doing state, no transition needed
        throw new Exception("Already in Doing state");
    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        // Transition from Doing to ReadyForTesting
        context.changeState(new ReadyForTestingState());
        return context.state;
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        // Transition not allowed directly from Doing to Testing
        throw new Exception("Transition from Doing to Testing is not allowed");
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        // Transition not allowed directly from Doing to Tested
        throw new Exception("Transition from Doing to Tested is not allowed");
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        // Transition not allowed directly from Doing to Done
        throw new Exception("Transition from Doing to Done is not allowed");
    }
}
