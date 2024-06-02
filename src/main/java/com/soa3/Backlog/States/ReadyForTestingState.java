package com.soa3.Backlog.States;

public class ReadyForTestingState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() throws Exception {
        context.changeState(new ToDoState());
        return context.state;
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        context.changeState(new DoingState());
        return context.state;
    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Already in ReadyForTesting state");
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        context.changeState(new TestingState());
        return context.state;
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        throw new Exception("Transition from ReadyForTesting to Tested is not allowed");
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        throw new Exception("Transition from ReadyForTesting to Done is not allowed");
    }
}
