package org.example.exercise01;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Arrays;

public class DirectoryLister {
    public void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            String[] contents = directory.list();
            if (contents != null) {
                Arrays.sort(contents);
                for (String item : contents) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }

    public void start() throws URISyntaxException {
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



