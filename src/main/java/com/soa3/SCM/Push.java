package com.soa3.SCM;

public class Push implements Command{

    SCM scm;

    public Push(SCM scm) {
        this.scm = scm;
    }

    @Override
    public void execute() {
        scm.push();
    }
}
