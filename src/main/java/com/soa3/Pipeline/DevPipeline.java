package com.soa3.Pipeline;

public class DevPipeline implements IDevOps {
    private Pipeline pipeline;

    public DevPipeline() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pipeline = new Pipeline();
    }

    @Override
    public void createSource() {
        pipeline.addStep("Source created for DevPipeline");
    }

    @Override
    public void createPackages() {
        pipeline.addStep("Packages created for DevPipeline");
    }

    @Override
    public void createBuild() {
        pipeline.addStep("Build created for DevPipeline");
    }

    @Override
    public void createTests() {
        pipeline.addStep("Tests created for DevPipeline");
    }

    @Override
    public void createAnalysis() {
        pipeline.addStep("Analysis created for DevPipeline");
    }

    @Override
    public void createDeploy() {
        pipeline.addStep("Deploy created for DevPipeline");
    }

    @Override
    public void createUtility() {
        pipeline.addStep("Utility created for DevPipeline");
    }

    @Override
    public Pipeline getResult() {
       return pipeline;
    }
}
