import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.soa3.Project;
import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Forum.Forum;
import com.soa3.Forum.ForumThread;
import com.soa3.Forum.ThreadComment;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;

public class ForumTest {
    @Test
      void CreateForumWithThread() throws Exception {

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Forum forum = new Forum();

        var forumSpy = Mockito.spy(forum);

        ForumThread forumThread = new ForumThread(backlog.getBacklogItems().get(0),scrumMaster);

        var forumThreadSpy = Mockito.spy(forumThread);

        forumSpy.createThread(forumThreadSpy);

        ThreadComment comment = new ThreadComment("message",scrumMaster);

        var commentSpy = Mockito.spy(comment);

        forumThreadSpy.addComment(commentSpy);


        Mockito.verify(forumSpy, Mockito.times(1)).createThread(forumThreadSpy);

        Mockito.verify(forumThreadSpy, Mockito.times(1)).addComment(commentSpy);


        forumSpy.getThreads();

        Mockito.verify(forumSpy, Mockito.times(1)).getThreads();

        forumThreadSpy.getComments();

        Mockito.verify(forumThreadSpy, Mockito.times(1)).getComments();

        forumThreadSpy.getComments();

    }

    @Test
    void CreateComment() throws Exception {

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

Forum forum = new Forum();

        var forumSpy = Mockito.spy(forum);

        ForumThread forumThread = new ForumThread(backlog.getBacklogItems().get(0),scrumMaster);

        var forumThreadSpy = Mockito.spy(forumThread);

        forumSpy.createThread(forumThreadSpy);

        ThreadComment comment = new ThreadComment("message",scrumMaster);

        var commentSpy = Mockito.spy(comment);

        forumThreadSpy.addComment(commentSpy);

        Mockito.verify(forumSpy, Mockito.times(1)).createThread(forumThreadSpy);

        Mockito.verify(forumThreadSpy, Mockito.times(1)).addComment(commentSpy);


        forumSpy.getThreads();

        Mockito.verify(forumSpy, Mockito.times(1)).getThreads();

        forumThreadSpy.getComments();

        Mockito.verify(forumThreadSpy, Mockito.times(1)).getComments();

        forumThreadSpy.getComments();

    }
}
