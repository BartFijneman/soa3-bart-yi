import com.soa3.*;
import com.soa3.Backlog.Activity;
import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Backlog.States.*;
import com.soa3.Person.Developer;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Person.Tester;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BacklogTest {

    @Test
    void CreateProjectWithBacklogAndBacklogItems(){
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        assertEquals("Project", project.getName());
        assertEquals(1, project.getId());
        assertEquals(3, project.getBacklog().getBacklogItems().size());
    }

    @Test
    void CreateActivitiesInBacklog(){
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        sprint.addBacklogItem(new BacklogItem("Backlog item"));

        assertEquals("Project", project.getName());
        assertEquals(1, project.getId());
        assertEquals(3, project.getBacklog().getBacklogItems().size());
    }
    @Test
    void CreateBacklog(){
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        assertNotEquals(null, backlog);
    }

    @Test
    void CreateBacklogActivities(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        assertEquals("Activity",   backlog.getBacklogItems().get(0).getActivities().get(0).getTitle());
    }

    @Test
    void DeveloperConnectedToSprintBacklogItem(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        assertTrue(backlog.getBacklogItems().get(0).getActivities().get(0).getPerson() instanceof Developer);
    }

    @Test
    void MultipleDevelopersMultipleActivities(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));
        backlog.getBacklogItems().get(1).addActivity(new Activity(developer,"Activity 2"));

        assertTrue(backlog.getBacklogItems().get(0).getActivities().get(0).getPerson() instanceof Developer);
        assertTrue(backlog.getBacklogItems().get(1).getActivities().get(0).getPerson() instanceof Developer);
    }


    @Test
    void SprintBackLogItemsToDoFase(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof ToDoState);
    }

    @Test
    void SprintBackLogItemsDoingFase(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof DoingState);
    }

    @Test
    void SprintBackLogItemsReadyForTestingFase(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof ReadyForTestingState);
    }

    @Test
    void SprintBackLogItemsTestingFase(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
            backlog.getBacklogItems().get(1).toTesting();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof TestingState);
    }

    @Test
    void SprintBackLogItemsTestingTestedNotSuccesfullBackToToDo(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
            backlog.getBacklogItems().get(1).setTestedSuccessfull(false);
            backlog.getBacklogItems().get(1).toTesting();
            backlog.getBacklogItems().get(1).toTested();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof ToDoState);
    }

    @Test
    void SprintBackLogItemsTestingTestedAndDoneItemIsNotDone(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
            backlog.getBacklogItems().get(1).setTestedSuccessfull(true);
            backlog.getBacklogItems().get(1).toTesting();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof TestingState);
    }

    @Test
    void SprintBackLogItemsTestingTestedAndDoneItemIsDoneNow(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
            backlog.getBacklogItems().get(1).setTestedSuccessfull(true);
            backlog.getBacklogItems().get(1).toTesting();
            backlog.getBacklogItems().get(1).toTested();
            backlog.getBacklogItems().get(1).toDone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof DoneState);
    }

    @Test
    void SprintBackLogItemsTestingTestedAndDoneItemIsDoneState(){
        List<Person> developers = new ArrayList<>();

        Person developer = new Developer("Johan");
        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        backlog.getBacklogItems().get(0).addActivity(new Activity(developer,"Activity"));

        try {
            backlog.getBacklogItems().get(1).toDoing();
            backlog.getBacklogItems().get(1).toReadyForTesting();
            backlog.getBacklogItems().get(1).setTestedSuccessfull(true);
            backlog.getBacklogItems().get(1).toTesting();
            backlog.getBacklogItems().get(1).toTested();
            backlog.getBacklogItems().get(1).toDone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(backlog.getBacklogItems().get(1).getState() instanceof DoneState);
    }

}
