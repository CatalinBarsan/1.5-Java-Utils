package org.example.exercise01;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        DirectoryLister directoryLister = new DirectoryLister();

        try {
            directoryLister.start();
        } catch (URISyntaxException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
