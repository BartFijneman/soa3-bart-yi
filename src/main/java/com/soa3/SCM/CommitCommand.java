package com.soa3.SCM;

public class CommitCommand implements Command {
    private SCMReceiver scm;
    private String message;

    public CommitCommand(SCMReceiver scm, String message) {
        this.scm = scm;
        this.message = message;
    }

    @Override
    public void execute() {
        scm.commit(message);
    }

    @Override
    public void undo() {
        scm.undoCommit();
    }
}
