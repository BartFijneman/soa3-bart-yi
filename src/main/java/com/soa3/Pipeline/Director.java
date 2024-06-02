package com.soa3.Pipeline;

public class Director {

    public void construct(IDevOps builder) {
        builder.createSource();
        builder.createPackages();
        builder.createBuild();
        builder.createTests();
        builder.createAnalysis();
        builder.createDeploy();
        builder.createUtility();
    }
}