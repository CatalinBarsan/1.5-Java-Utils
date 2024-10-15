package org.example.exercise01;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;

public class DirectoryLister {

    // Method to list the contents of a directory
    public void listDirectoryContents(String directoryPath) {
        System.out.println("Checking path: " + directoryPath);
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            String[] contents = directory.list();
            if (contents != null) {
                Arrays.sort(contents); // Sort the contents alphabetically
                for (String item : contents) {
                    System.out.println(item);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }

    // Method to start the directory listing process
    public void start() {
        try {
            File resourceDirectory = new File(DirectoryLister.class.getClassLoader().getResource("Directory01").toURI());
            listDirectoryContents(resourceDirectory.getAbsolutePath());
        } catch (NullPointerException e) {
            System.out.println("Directory 'Directory01' not found in resources.");
        } catch (URISyntaxException e) {
            System.out.println("Error converting resource URL to URI: " + e.getMessage());
        }
    }
}




