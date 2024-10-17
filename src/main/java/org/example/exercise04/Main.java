package org.example.exercise04;

import static org.example.exercise04.FileReaderExample.readFile;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            readFile(args[0]);  // Call readFile with the provided file path
        } else {
            System.out.println("Please provide a file path.");  // Prompt if no arguments are given
        }
    }
}
