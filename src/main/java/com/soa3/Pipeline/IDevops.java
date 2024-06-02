package com.soa3.Pipeline;

import com.soa3.Pipeline.Pipeline;  // Make sure the import path is correct

public interface IDevOps {
    void reset();
    void createSource();
    void createPackages();
    void createBuild();
    void createTests();
    void createAnalysis();
    void createDeploy();
    void createUtility();
    Pipeline getResult();
}
