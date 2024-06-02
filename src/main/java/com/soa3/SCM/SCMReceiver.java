package com.soa3.SCM;

public class SCMReceiver {
    public void commit(String message) {
        System.out.println("Committing with message: " + message);
        // Implementatie van commit logica (bv. Git command line aanroepen)
    }

    public void undoCommit() {
        System.out.println("Undoing the last commit");
        // Implementatie van undo commit logica (bv. Git command line aanroepen)
    }

    public void createBranch(String branchName) {
        System.out.println("Creating branch: " + branchName);
        // Implementatie van branch logica (bv. Git command line aanroepen)
    }

    public void undoCreateBranch(String branchName) {
        System.out.println("Deleting branch: " + branchName);
        // Implementatie van undo branch logica (bv. Git command line aanroepen)
    }

    public void push() {
        System.out.println("Pushing to remote repository");
        // Implementatie van push logica (bv. Git command line aanroepen)
    }

    public void undoPush() {
        System.out.println("Undoing the last push");
        // Implementatie van undo push logica (bv. Git command line aanroepen)
    }

    public void pull() {
        System.out.println("Pulling from remote repository");
        // Implementatie van pull logica (bv. Git command line aanroepen)
    }

    public void undoPull() {
        System.out.println("Undoing the last pull");
        // Implementatie van undo pull logica (bv. Git command line aanroepen)
    }
}
