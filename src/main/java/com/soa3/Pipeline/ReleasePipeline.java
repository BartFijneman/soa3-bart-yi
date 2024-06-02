package com.soa3.Pipeline;

import com.soa3.Pipeline.Pipeline;

public class ReleasePipeline implements IDevOps {
    private Pipeline pipeline;

    public ReleasePipeline() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pipeline = new Pipeline();
    }

    @Override
    public void createSource() {
        pipeline.addStep("Source created for ReleasePipeline");
    }

    @Override
    public void createPackages() {
        pipeline.addStep("Packages created for ReleasePipeline");
    }

    @Override
    public void createBuild() {
        pipeline.addStep("Build created for ReleasePipeline");
    }

    @Override
    public void createTests() {
        pipeline.addStep("Tests created for ReleasePipeline");
    }

    @Override
    public void createAnalysis() {
        pipeline.addStep("Analysis created for ReleasePipeline");
    }

    @Override
    public void createDeploy() {
        pipeline.addStep("Deploy created for ReleasePipeline");
    }

    @Override
    public void createUtility() {
        pipeline.addStep("Utility created for ReleasePipeline");
    }

    @Override
    public Pipeline getResult() {
       return pipeline;
    }
}
