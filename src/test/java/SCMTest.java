// import com.soa3.*;
// import com.soa3.Backlog.Activity;
// import com.soa3.Backlog.Backlog;
// import com.soa3.Backlog.BacklogItem;
// import com.soa3.Person.Person;
// import com.soa3.Person.ProductOwner;
// import com.soa3.SCM.*;
// import com.soa3.Sprint.Sprint;
// import com.soa3.Sprint.SprintType;

// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;

// import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// public class SCMTest {

//     @Test
//     void commit() throws Exception {

//         Person productOwner = new ProductOwner("Pieter");
//         Person scrumMaster = new ProductOwner("Jansen");

//         Project project = new Project("Project",1, productOwner);

//         Backlog backlog = project.getBacklog();

//         backlog.add(new BacklogItem("Create backend"));
//         backlog.add(new BacklogItem("Create frontend"));
//         backlog.add(new BacklogItem("Create database"));


//         backlog.getBacklogItems().get(0).setPerson(scrumMaster);
//         backlog.getBacklogItems().get(1).setPerson(productOwner);
//         backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"create erd"));
//         backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"setup database"));

      

//         SCM scm = new Github();

//         var SCMSpy = Mockito.spy(scm);

//         Commit commitCmd = new Commit(SCMSpy,"commit message");

//         var commitSpy = Mockito.spy(commitCmd);

//         CMD cmd = new CMD(commitSpy);

//         var cmdSpy = Mockito.spy(cmd);

//         cmdSpy.runCmd();

//         Mockito.verify(cmdSpy).runCmd();
//         Mockito.verify(cmdSpy, Mockito.times(1)).runCmd();
//     }

//     @Test
//     void push() throws Exception {
       
//         Person productOwner = new ProductOwner("Pieter");
//         Person scrumMaster = new ProductOwner("Jansen");

//         Project project = new Project("Project",1, productOwner);

//         Backlog backlog = project.getBacklog();

//         backlog.add(new BacklogItem("Create backend"));
//         backlog.add(new BacklogItem("Create frontend"));
//         backlog.add(new BacklogItem("Create database"));


//         backlog.getBacklogItems().get(0).setPerson(scrumMaster);
//         backlog.getBacklogItems().get(1).setPerson(productOwner);
//         backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"create erd"));
//         backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"setup database"));


//         SCM scm = new Github();

//         var SCMSpy = Mockito.spy(scm);

//         Push pushCmd = new Push(SCMSpy);

//         var pushSpy = Mockito.spy(pushCmd);

//         CMD cmd = new CMD(pushSpy);

//         var cmdSpy = Mockito.spy(cmd);

//         cmdSpy.runCmd();

//         Mockito.verify(cmdSpy).runCmd();
//         Mockito.verify(cmdSpy, Mockito.times(1)).runCmd();
//     }

//     @Test
//     void pull() throws Exception {
//         Person productOwner = new ProductOwner("Pieter");
//         Person scrumMaster = new ProductOwner("Jansen");

//         Project project = new Project("Project",1, productOwner);

//         Backlog backlog = project.getBacklog();

//         backlog.add(new BacklogItem("Create backend"));
//         backlog.add(new BacklogItem("Create frontend"));
//         backlog.add(new BacklogItem("Create database"));


//         backlog.getBacklogItems().get(0).setPerson(scrumMaster);
//         backlog.getBacklogItems().get(1).setPerson(productOwner);
//         backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"create erd"));
//         backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"setup database"));


//         SCM scm = new Github();

//         var SCMSpy = Mockito.spy(scm);

//         PullCommand pullCmd = new PullCommand(SCMSpy);

//         var pullSpy = Mockito.spy(pullCmd);

//         CMD cmd = new CMD(pullSpy);

//         var cmdSpy = Mockito.spy(cmd);

//         cmdSpy.runCmd();

//         Mockito.verify(cmdSpy).runCmd();
//         Mockito.verify(cmdSpy, Mockito.times(1)).runCmd();
//     }

//     @Test
//     void createBranch() throws Exception {
//         Person productOwner = new ProductOwner("Pieter");
//         Person scrumMaster = new ProductOwner("Jansen");

//         Project project = new Project("Project",1, productOwner);

//         Backlog backlog = project.getBacklog();

//         backlog.add(new BacklogItem("Create backend"));
//         backlog.add(new BacklogItem("Create frontend"));
//         backlog.add(new BacklogItem("Create database"));


//         backlog.getBacklogItems().get(0).setPerson(scrumMaster);
//         backlog.getBacklogItems().get(1).setPerson(productOwner);
//         backlog.getBacklogItems().get(2).addActivity(new Activity(scrumMaster,"create erd"));
//         backlog.getBacklogItems().get(2).addActivity(new Activity(productOwner,"setup database"));


//         SCM scm = new Github();

//         var SCMSpy = Mockito.spy(scm);

//         BranchCommand branchCmd = new BranchCommand(SCMSpy,"branch name");

//         var branchSpy = Mockito.spy(branchCmd);

//         CMD cmd = new CMD(branchSpy);

//         var cmdSpy = Mockito.spy(cmd);

//         cmdSpy.runCmd();

//         Mockito.verify(cmdSpy).runCmd();
//         Mockito.verify(cmdSpy, Mockito.times(1)).runCmd();
//     }
// }
