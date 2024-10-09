package org.example.exercise02;
import java.io.File;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class RecursiveDirectoryLister {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public void listDirectoryTree(String directoryPath, int level) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] contents = directory.listFiles();
            if (contents != null) {
                Arrays.sort(contents);
                for (File file : contents) {
                    for (int i = 0; i < level; i++) {
                        System.out.print("  ");
                    }
                    if (file.isDirectory()) {
                        System.out.println("(D) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                        listDirectoryTree(file.getAbsolutePath(), level + 1);
                    } else {
                        System.out.println("(F) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                    }
                }
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }

}
