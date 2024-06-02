package com.soa3.SCM;

import java.util.Stack;

public class SCMInvoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        commandHistory.push(command);
    }

    public void executeCommand() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.peek();
            command.execute();
        }
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
