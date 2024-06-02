
package com.soa3.Sprint;
public class InProgressState implements SprintState {
    @Override
    public void startSprint(Sprint sprint) {
        System.out.println("Sprint is already started.");
    }

    public void progressSprint(Sprint sprint) {
        System.out.println("Sprint is already in progress.");
    }

    @Override
    public void finishSprint(Sprint sprint) {
        sprint.setStatus(new FinishedState());
        System.out.println("Sprint is finished.");
    }

    @Override
    public void reviewSprint(Sprint sprint) {
        sprint.setStatus(new ReviewState());
        System.out.println("Sprint is under review.");
    }

    @Override
    public void cancelSprint(Sprint sprint) {
        sprint.setStatus(new CancelledState());
        System.out.println("Sprint is cancelled.");
    }
}
