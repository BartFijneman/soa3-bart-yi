package com.soa3.Report;

import com.soa3.Sprint.Sprint;

public class ReportExportPng implements ReportExport {

    public void export(Sprint sprint) throws Exception {
        System.out.println("Exporting PNG");
    }

    public String getExtension() {
        return "png";
    }
}
