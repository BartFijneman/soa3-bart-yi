package com.soa3.SCM;

public class Main {
    public static void main(String[] args) {
        SCMReceiver scmReceiver = new SCMReceiver();

        // Maak commando's aan
        Command commitCommand = new CommitCommand(scmReceiver, "Initial commit");
        Command pushCommand = new PushCommand(scmReceiver);
        Command pullCommand = new PullCommand(scmReceiver);
        Command branchCommand = new BranchCommand(scmReceiver, "feature-branch");

        // Invoker aanmaken
        SCMInvoker invoker = new SCMInvoker();

        // Commit uitvoeren
        invoker.setCommand(commitCommand);
        invoker.executeCommand();

        // Push uitvoeren
        invoker.setCommand(pushCommand);
        invoker.executeCommand();

        // Pull uitvoeren
        invoker.setCommand(pullCommand);
        invoker.executeCommand();

        // Branch aanmaken
        invoker.setCommand(branchCommand);
        invoker.executeCommand();

        // Undo branch
        invoker.undoCommand();

        // Undo pull
        invoker.undoCommand();

        // Undo push
        invoker.undoCommand();

        // Undo commit
        invoker.undoCommand();
    }
}
