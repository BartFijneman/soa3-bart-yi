package com.soa3.Sprint;

public interface SprintState {

    void startSprint(Sprint sprint);
    void progressSprint(Sprint sprint);
    void finishSprint(Sprint sprint);
    void reviewSprint(Sprint sprint);
    void cancelSprint(Sprint sprint);
}
