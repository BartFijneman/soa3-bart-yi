package com.soa3.Sprint;

import com.soa3.Backlog.BacklogItem;
import com.soa3.Pipeline.DevPipelineBuilder;
import com.soa3.Pipeline.IDevops;
import com.soa3.Pipeline.ReleasePipelineBuilder;
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
    private SprintStatus status;

    private List<Person> developers;
    private Person scrumMaster;
    private List<BacklogItem> backlogItems;

    public ReportExport sprintExportBehavior;

    public Sprint(Project project, String name, LocalDate startDate, LocalDate endDate, SprintType type, List<Person> developers, Person scrumMaster) {
        this.project = project;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.backlogItems = new ArrayList<BacklogItem>();
        this.developers = developers;
        this.scrumMaster = scrumMaster;
    }

    public void runPipeline(){
        IDevops devops;

        if(this.type == SprintType.RELEASE){

            devops = new ReleasePipelineBuilder(this);
            devops.createSource();
            devops.createPackages();
            devops.createBuild();
            devops.createTests();
            devops.createAnalysis();
            devops.createUtility();
            devops.createDeploy();
        }else{

            devops = new DevPipelineBuilder(this);
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
}
