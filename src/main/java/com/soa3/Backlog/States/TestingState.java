package com.soa3.Backlog.States;

import com.soa3.Backlog.BacklogItem;
import com.soa3.Notification.EmailObserver;
import com.soa3.Person.ScrumMaster;

public class TestingState implements BacklogItemState {

    private final BacklogItem backlogItem;

    public TestingState(BacklogItem backlogItem) {
        this.backlogItem = backlogItem;
    }

    public BacklogItemState toToDo() throws Exception {
        return new ToDoState(this.backlogItem);
    }

    public BacklogItemState toDoing() throws Exception {
        throw new Exception("Can't go to doing");
    }

    public BacklogItemState toReadyForTesting() throws Exception {
        throw new Exception("Already ready for testing");
    }

    public BacklogItemState toTesting() throws Exception {
        throw new Exception("Already testing");
    }

    public BacklogItemState toTested() {
        if(!this.backlogItem.isTestedSuccessfull()){

            /*
             * Notify scrummaster
             */
            if (this.backlogItem.getPerson() instanceof ScrumMaster) {

                new EmailObserver(this.backlogItem);
                this.backlogItem.notifyObservers("Notify scrum master " + backlogItem.getPerson().getName());
            }

            return new ToDoState(this.backlogItem);
        }

        return new TestedState(this.backlogItem);
    }

    public BacklogItemState toDone() throws Exception {
        throw new Exception("First complete tests");
    }

}
