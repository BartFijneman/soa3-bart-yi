package com.soa3.SCM;

public class Commit implements Command{
    SCM scm;
    String message;

    public Commit(SCM scm, String message) {
        this.scm = scm;
        this.message = message;
    }

    @Override
    public void execute() {
        scm.commit(this.message);
    }
}
