package com.soa3.Pipeline;

import com.soa3.Sprint.Sprint;

public class ReleasePipelineBuilder implements IDevops{

    private Sprint sprint;
    private boolean isRunning;

    public ReleasePipelineBuilder(Sprint sprint) {
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
    }

    public void createAnalysis() {
        System.out.println("Create analysis");
    }

    public void createDeploy() {
        System.out.println("Create deploy");
        isRunning = false;
    }

    public void createUtility() {
        System.out.println("Create utility");
    }
}
