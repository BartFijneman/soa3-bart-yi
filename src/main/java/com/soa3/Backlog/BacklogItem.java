package com.soa3.Backlog;

import com.soa3.Backlog.States.*;
import com.soa3.Notification.NotificationObservable;
import com.soa3.Person.Person;
import com.soa3.Sprint.Sprint;

import java.util.ArrayList;
import java.util.List;

public class BacklogItem extends NotificationObservable {

    private String title;
    private Person person;
    private List<Activity> activities;
    private Backlog backlog;
    private BacklogItemState state;
    private boolean testedSuccesfull = false;

    private Sprint sprint;

    public BacklogItem(String title) {
        this.title = title;
        this.activities = new ArrayList<Activity>();

        this.state = new ToDoState();
    }

    public void toToDo() throws Exception {
        this.state = this.state.toToDo();
    }

    public void toDoing() throws Exception {
        this.state = this.state.toDoing();
    }

    public void toReadyForTesting() throws Exception {
        this.state = this.state.toReadyForTesting();
    }

    public void toTesting() throws Exception {
        this.state = this.state.toTesting();
    }

    public void toTested() throws Exception {
        this.state = this.state.toTested();
    }

    public void toDone() throws Exception {
        this.state = this.state.toDone();
    }

    public BacklogItemState getState() {
        return state;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public boolean isTestedSuccessfull() {
        return this.testedSuccesfull;
    }

    public void setTestedSuccessfull(boolean testedSuccesfull) {
        this.testedSuccesfull = testedSuccesfull;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public boolean isDone(){
        boolean check = true;

        for (Activity activity : this.activities) {
            if (!activity.isDone()) {
                check = false;
                break;
            }
        }
        return check;
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }


}
