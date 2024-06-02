package com.soa3.Sprint;
public class NewState implements SprintState {
    @Override
    public void startSprint(Sprint sprint) {
        System.out.println("Sprint is started.");
    }

    public void progressSprint(Sprint sprint) {
        System.out.println("Sprint is already in progress.");
    }

    @Override
    public void finishSprint(Sprint sprint) {
        System.out.println("Cannot finish sprint. Sprint is new and not started yet.");
    }

    @Override
    public void reviewSprint(Sprint sprint) {
        System.out.println("Cannot review sprint. Sprint is new and not started yet.");
    }

    @Override
    public void cancelSprint(Sprint sprint) {
        sprint.setStatus(new CancelledState());
        System.out.println("Sprint is cancelled.");
    }
}
