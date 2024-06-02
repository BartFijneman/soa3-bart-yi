package com.soa3.Sprint;

import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Pipeline.ReleasePipeline;
import com.soa3.Pipeline.IDevOps;
import com.soa3.Project;
import com.soa3.Report.ReportExport;
import com.soa3.Person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {

    private Project project;
    private String name;

    private LocalDate startDate;
    private LocalDate endDate;

    private SprintType type;
    private SprintState status;
    private List<Person> developers;
    private Person scrumMaster;
    private List<BacklogItem> backlogItems;

    public ReportExport sprintExportBehavior;


    public void setStatus(SprintState status) {
        this.status = status;
    }

    public Sprint(Project project, String name, LocalDate startDate, LocalDate endDate, SprintType type, List<Person> developers, Person scrumMaster) {
        this.project = project;
        this.name = name;
        this.type = type;
        
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = new NewState();
        this.backlogItems = new ArrayList<BacklogItem>();
    }

    public void runPipeline(){
        IDevOps devops;

        if(this.type == SprintType.RELEASE){

            devops = new ReleasePipeline();
            devops.createSource();
            devops.createPackages();
            devops.createBuild();
            devops.createTests();
            devops.createAnalysis();
            devops.createUtility();
            devops.createDeploy();
        }else{

            devops = new ReleasePipeline();
            devops.createSource();
            devops.createPackages();
            devops.createBuild();
            devops.createTests();
            devops.createAnalysis();
        }
    }

    public void addBacklogItem(BacklogItem backlogItem){
        backlogItems.add(backlogItem);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BacklogItem> getBacklogItems() {
        return backlogItems;
    }

    public void export(ReportExport sprintExportBehavior) throws Exception {
        sprintExportBehavior.export(this);
    }

    public void startSprint() {
        status.startSprint(this);
    }

    public void finishSprint() {
        status.finishSprint(this);
    }

    public void reviewSprint() {
        status.reviewSprint(this);
    }

    public void cancelSprint() {
        status.cancelSprint(this);
    }
}
