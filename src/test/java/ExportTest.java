

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.soa3.Project;
import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Report.ReportExportPdf;
import com.soa3.Report.ReportExportPng;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;

public class ExportTest {
    

      @Test
      void TestedExportToPDFBehavior() throws Exception {
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

      var sprintSpy = Mockito.spy(sprint);

        var exportToPDF = new ReportExportPdf();

        sprintSpy.export(exportToPDF);

        Mockito.verify(sprintSpy).export(exportToPDF);

        Mockito.verify(sprintSpy, Mockito.times(1)).export(exportToPDF);
    }

    @Test
      void TestedExportToPNGBehavior() throws Exception {
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ProductOwner("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

      var sprintSpy = Mockito.spy(sprint);

        var exportToPNG = new ReportExportPng();

        sprintSpy.export(exportToPNG);

        Mockito.verify(sprintSpy).export(exportToPNG);

        Mockito.verify(sprintSpy, Mockito.times(1)).export(exportToPNG);
    }
}
