package com.soa3.SCM;

public class PushCommand implements Command {
    private SCMReceiver scm;

    public PushCommand(SCMReceiver scm) {
        this.scm = scm;
    }

    @Override
    public void execute() {
        scm.push();
    }

    @Override
    public void undo() {
        scm.undoPush();
    }
}
