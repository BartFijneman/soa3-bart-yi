package com.soa3.Report;

import com.soa3.Sprint.Sprint;

public class ReportExportPdf implements ReportExport {

    public void export(Sprint sprint) throws Exception {
        System.out.println("Exporting PDF");
    }

    public String getExtension() {
        return "pdf";
    }

}
