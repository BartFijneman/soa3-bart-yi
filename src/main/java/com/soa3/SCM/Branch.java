package com.soa3.SCM;

public class Branch implements Command {

    SCM scm;
    String name;

    public Branch(SCM scm, String name) {
        this.scm = scm;
        this.name = name;
    }

    public void execute() {
        scm.branch(this.name);
    }
}
