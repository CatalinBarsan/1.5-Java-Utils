package org.example.exercise02;

import java.io.File;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        RecursiveDirectoryLister rcs = new RecursiveDirectoryLister();

        try {
            File resourceDirectory = new File(RecursiveDirectoryLister.class.getClassLoader().getResource("Directory01").toURI());
            rcs.listDirectoryTree(resourceDirectory.getAbsolutePath(), 0);
        } catch (NullPointerException e) {
            System.out.println("Directory 'Directory01' not found in resources.");
        } catch (URISyntaxException e) {
            System.out.println("Error converting resource URL to URI: " + e.getMessage());
        }
    }

}
