package com.soa3.Pipeline;

public interface IDevops {

    void createSource();
    void createPackages();
    void createBuild();
    void createTests();
    void createAnalysis();
    void createDeploy();
    void createUtility();

}
