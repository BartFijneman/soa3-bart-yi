package com.soa3.Backlog.States;

public class TestingState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() throws Exception {
        throw new Exception("Transition from Testing to ToDo is not allowed");
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Transition from Testing to Doing is not allowed");
    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        context.changeState(new ReadyForTestingState());
        return context.state;
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Already in Testing state");
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        context.changeState(new TestedState());
        return context.state;
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        throw new Exception("Transition from Testing to Done is not allowed");
    }
}
