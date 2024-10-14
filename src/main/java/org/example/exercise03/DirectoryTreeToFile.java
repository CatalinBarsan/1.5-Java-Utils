package org.example.exercise03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTreeToFile {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public static void saveDirectoryTree(String directoryPath, String outputFilePath, int level, BufferedWriter writer) throws IOException {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] contents = directory.listFiles();
            if (contents != null) {
                Arrays.sort(contents);
                for (File file : contents) {
                    for (int i = 0; i < level; i++) {
                        writer.write("  ");
                    }
                    if (file.isDirectory()) {
                        writer.write("(D) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()) + "\n");
                        // Recursive call for subdirectories
                        saveDirectoryTree(file.getAbsolutePath(), outputFilePath, level + 1, writer);
                    } else {
                        writer.write("(F) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()) + "\n");
                    }
                }
            }
        } else {
            writer.write("The provided path is not a directory.\n");
        }
    }
}



