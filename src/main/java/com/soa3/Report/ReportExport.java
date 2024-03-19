package com.soa3.Report;

import com.soa3.Sprint.Sprint;

public interface ReportExport {

    public String getExtension();

    void export(Sprint sprint) throws Exception;
}
