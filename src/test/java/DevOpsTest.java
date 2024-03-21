import com.soa3.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.soa3.Backlog.Activity;
import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Person.ScrumMaster;
import com.soa3.Pipeline.IDevops;
import com.soa3.Pipeline.ReleasePipelineBuilder;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;

public class DevOpsTest {
    @Test
    void runReleasePipeline() throws Exception {
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ScrumMaster("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);


        backlog.getBacklogItems().get(0).setPerson(productOwner);
        backlog.getBacklogItems().get(1).setPerson(scrumMaster);
        backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"create erd"));
        backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"setup database"));


        var sprintSpy = Mockito.spy(sprint);

        sprintSpy.runPipeline();

        Mockito.verify(sprintSpy, Mockito.times(1)).runPipeline();
    }

   

    @Test
    void CreateReleasePipeline() throws Exception {
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ScrumMaster("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("backend"));
        backlog.add(new BacklogItem("frontend"));
        backlog.add(new BacklogItem("database"));

        backlog.getBacklogItems().get(0).setPerson(productOwner);
        backlog.getBacklogItems().get(1).setPerson(scrumMaster);
        backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"create erd"));
        backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"setup database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);
        sprint.addBacklogItem(backlog.getBacklogItems().get(0));
        IDevops devops = new ReleasePipelineBuilder(sprint);
        sprint.runPipeline();
        var devopsSpy = Mockito.spy(devops);

        devopsSpy.createSource();
        Mockito.verify(devopsSpy, Mockito.times(1)).createSource();
        devopsSpy.createPackages();
        Mockito.verify(devopsSpy, Mockito.times(1)).createPackages();
        devopsSpy.createBuild();
        Mockito.verify(devopsSpy, Mockito.times(1)).createBuild();
        devopsSpy.createTests();
        Mockito.verify(devopsSpy, Mockito.times(1)).createTests();
        devopsSpy.createAnalysis();
        Mockito.verify(devopsSpy, Mockito.times(1)).createAnalysis();
        devopsSpy.createDeploy();
        Mockito.verify(devopsSpy, Mockito.times(1)).createDeploy();
        devopsSpy.createUtility();
        Mockito.verify(devopsSpy, Mockito.times(1)).createUtility();
    }
}
