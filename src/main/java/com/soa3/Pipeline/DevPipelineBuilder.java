package com.soa3.Pipeline;

import com.soa3.Sprint.Sprint;

public class DevPipelineBuilder implements IDevops{

    private Sprint sprint;
    private boolean isRunning;

    public DevPipelineBuilder(Sprint sprint) {
        this.sprint = sprint;
        this.isRunning = true;
    }

    public void createSource() {
        System.out.println("Create source");
    }

    public void createPackages() {
        System.out.println("Create packages");
    }

    public void createBuild() {
        System.out.println("Create build");
    }

    public void createTests() {
        System.out.println("Create tests");
        isRunning = false;
    }

    public void createAnalysis() {

    }

    public void createDeploy() {

    }

    public void createUtility() {

    }
}
