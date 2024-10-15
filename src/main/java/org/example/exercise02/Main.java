package org.example.exercise02;

public class Main {

    public static void main(String[] args) {
        // Check if a directory path has been provided
        if (args.length == 0) {
            System.out.println("Please provide a directory path as an argument.");
        } else {
            RecursiveDirectoryLister rcs = new RecursiveDirectoryLister();
            String directoryPath = args[0];
            rcs.listDirectoryTree(directoryPath, 0); // Call the method to list the directory tree
        }
    }
}


