package com.soa3;

import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Person.ScrumMaster;
import com.soa3.Report.Report;
import com.soa3.Report.ReportExport;
import com.soa3.Report.ReportExportPdf;
import com.soa3.Report.ReportExportPng;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //
        List<Person> developers = new ArrayList<>();

        Person productOwner = new ProductOwner("Pieter");
        Person scrumMaster = new ScrumMaster("Jansen");

        Project project = new Project("Project",1, productOwner);

        Backlog backlog = project.getBacklog();

        backlog.add(new BacklogItem("Create backend"));
        backlog.add(new BacklogItem("Create frontend"));
        backlog.add(new BacklogItem("Create database"));

        Sprint sprint = new Sprint(project,"Sprint 1", LocalDate.parse("2024-03-03"),LocalDate.parse("2024-03-30"), SprintType.RELEASE, developers, scrumMaster);

        ReportExport reportExport = new ReportExportPdf();
//        reportExport.export(sprint);
    }

}
