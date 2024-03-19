package com.soa3.Report;

import com.soa3.Sprint.Sprint;

public class Report {

    private Sprint sprint;
    private String version;

    public void report(Sprint sprint) {
        this.sprint = sprint;
    }

    public void export(ReportExport reportExport) throws Exception {
        reportExport.export(sprint);
    }

}
