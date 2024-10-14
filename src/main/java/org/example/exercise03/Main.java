package org.example.exercise03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.exercise03.DirectoryTreeToFile.saveDirectoryTree;

public class Main {
    public static void main(String[] args) {
        // Check if both arguments (directory path and output file path) are provided
        if (args.length == 2) {
            String directoryPath = args[0];
            String outputFilePath = args[1];
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                // Call the method to save the directory tree
                saveDirectoryTree(directoryPath, outputFilePath, 0, writer);
                System.out.println("Directory tree saved to " + outputFilePath);
            } catch (IOException e) {
                System.out.println("An error occurred while saving the file: " + e.getMessage());
            }
        } else {
            System.out.println("Please provide both a directory path and an output file path.");
        }
    }
}

