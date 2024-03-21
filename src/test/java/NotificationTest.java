import com.soa3.*;
import com.soa3.Backlog.Activity;
import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Notification.EmailObserver;
import com.soa3.Notification.SlackObserver;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationTest {

    @Test
    void NotificationTestEmail() throws Exception {
          List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);
        sprint.addBacklogItem(backlog.getBacklogItems().get(0));

        
        var notificationObserver = new EmailObserver(sprint.getBacklogItems().get(0));
        var adapterSpy = Mockito.spy(notificationObserver.getObservable());

        //notificationObserver.notifyAll();
        adapterSpy.notifyObservers("Hello");

        //assertEquals("test",emailSpy.notifyAll());
        Mockito.verify(adapterSpy, Mockito.times(1)).notifyObservers("Hello");
    }

    @Test
    void NotificationTestSlack() throws Exception {
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

       
        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);
        sprint.addBacklogItem(backlog.getBacklogItems().get(0));

        
        var notificationObserver = new SlackObserver(sprint.getBacklogItems().get(0));
        var adapterSpy = Mockito.spy(notificationObserver.getObservable());

        //notificationObserver.notifyAll();
        adapterSpy.notifyObservers("Hello");

        //assertEquals("test",emailSpy.notifyAll());
        Mockito.verify(adapterSpy, Mockito.times(1)).notifyObservers("Hello");
    }
}