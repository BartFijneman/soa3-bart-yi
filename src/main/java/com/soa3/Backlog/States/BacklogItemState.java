package com.soa3.Backlog.States;

public interface BacklogItemState {

    public BacklogItemState toToDo() throws Exception;
    public BacklogItemState toDoing() throws Exception;
    public BacklogItemState toReadyForTesting() throws Exception;
    public BacklogItemState toTesting() throws Exception;
    public BacklogItemState toTested() throws Exception;
    public BacklogItemState toDone() throws Exception;
    public void setContext(Context context);
}