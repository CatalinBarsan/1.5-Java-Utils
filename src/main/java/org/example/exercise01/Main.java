package org.example.exercise01;

public class Main {

    public static void main(String[] args) {
        // Check if a directory path has been provided
        if (args.length == 0) {
            System.out.println("Please provide a directory path as an argument.");
        } else {
            String directoryPath = args[0];
            DirectoryLister directoryLister = new DirectoryLister();
            directoryLister.listDirectoryContents(directoryPath); // List the contents of the provided directory
        }
    }
}




