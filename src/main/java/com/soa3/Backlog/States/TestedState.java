package com.soa3.Backlog.States;

public class TestedState implements BacklogItemState {
    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BacklogItemState toToDo() { 
    System.out.println("Transition from Tested to ToDo is not allowed");
      return null;
    }

    @Override
    public BacklogItemState toDoing() throws Exception {
        System.out.println("Transition from Tested to Doing is not allowed");
        return null;    }

    @Override
    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Transition from Tested to ReadyForTesting is not allowed");
    }

    @Override
    public BacklogItemState toTesting() throws Exception {
        context.changeState(new TestingState());
        return context.state;
    }

    @Override
    public BacklogItemState toTested() throws Exception {
        throw new Exception("Already in Tested state");
    }

    @Override
    public BacklogItemState toDone() throws Exception {
        context.changeState(new DoneState());
        return context.state;
    }
}
