package com.soa3.SCM;

public class BranchCommand implements Command {
    private SCMReceiver scm;
    private String branchName;

    public BranchCommand(SCMReceiver scm, String branchName) {
        this.scm = scm;
        this.branchName = branchName;
    }

    @Override
    public void execute() {
        scm.createBranch(branchName);
    }

    @Override
    public void undo() {
        scm.undoCreateBranch(branchName);
    }
}
