package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;

public class Context {
    
    public BacklogItem backlogItem;
    public BacklogItemState state;
    

public Context(BacklogItemState initialState) {
    this.state = initialState;
    this.state.setContext(this);
}

public void changeState(BacklogItemState state) {
    this.state = state;
    this.state.setContext(this);
}



public void toToDo() throws Exception {
    state.toToDo();
}

public void toDoing() throws Exception {
    state.toDoing();
}
public void toReadyForTesting() throws Exception {
    state.toReadyForTesting();
}
public void toTesting() throws Exception {
    state.toTesting();
}
public void toTested() throws Exception {
    state.toTested();
}
public void toDone() throws Exception {
    state.toDoing();
}

}
