package com.soa3.SCM;

public class PullCommand implements Command {
    private SCMReceiver scm;

    public PullCommand(SCMReceiver scm) {
        this.scm = scm;
    }

    @Override
    public void execute() {
        scm.pull();
    }

    @Override
    public void undo() {
        scm.undoPull();
    }
}
