package com.soa3.SCM;

public class Pull implements Command{

    SCM scm;

    public Pull(SCM scm) {
        this.scm = scm;
    }

    @Override
    public void execute() {
        scm.pull();
    }
}
