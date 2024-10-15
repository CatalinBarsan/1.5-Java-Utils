package org.example.exercise02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class RecursiveDirectoryLister {
    // Date format for displaying last modified date
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    // Method to recursively list the directory tree
    public void listDirectoryTree(String directoryPath, int level) {
        File directory = new File(directoryPath);

        // Check if the provided path is a directory
        if (directory.isDirectory()) {
            File[] contents = directory.listFiles(); // List files and subdirectories
            if (contents != null) {
                Arrays.sort(contents); // Sort contents alphabetically
                for (File file : contents) {
                    // Print the appropriate indentation for the level
                    for (int i = 0; i < level; i++) {
                        System.out.print("  ");
                    }

                    // Print the name of the file or directory and its last modified date
                    if (file.isDirectory()) {
                        System.out.println("(D) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                        // Recursively call listDirectoryTree for subdirectories
                        listDirectoryTree(file.getAbsolutePath(), level + 1);
                    } else {
                        System.out.println("(F) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            // Message if the provided path is not a directory
            System.out.println("The provided path is not a directory.");
        }
    }
}

