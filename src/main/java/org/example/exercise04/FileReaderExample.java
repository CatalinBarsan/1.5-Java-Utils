package org.example.exercise04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void readFile(String filePath) {
        System.out.println("Reading file: " + filePath);  // Debug message
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Output each line from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            readFile(args[0]);  // Call readFile with the provided file path
        } else {
            System.out.println("Please provide a file path.");  // Prompt if no arguments are given
        }
    }
}


