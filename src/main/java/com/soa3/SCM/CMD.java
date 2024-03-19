package com.soa3.SCM;

public class CMD {
    Command cmd;

    public CMD(Command cmd) {
        this.cmd = cmd;
    }

    public void runCmd(){
        cmd.execute();
    }
}
