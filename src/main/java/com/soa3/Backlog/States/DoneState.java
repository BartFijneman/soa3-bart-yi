package com.soa3.Backlog.States;

public class DoneState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Transition from Done to ToDo is not allowed");
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Transition from Done to Doing is not allowed");
    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Transition from Done to ReadyForTesting is not allowed");
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Transition from Done to Testing is not allowed");
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        throw new Exception("Transition from Done to Tested is not allowed");
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        throw new Exception("Already in Done state");
    }
}
