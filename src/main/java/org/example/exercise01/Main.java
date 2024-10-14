package org.example.exercise01;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory path as an argument.");
            return;
        }

        String directoryPath = args[0];
        DirectoryLister directoryLister = new DirectoryLister();

        try {
            directoryLister.listDirectoryContents(directoryPath);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


