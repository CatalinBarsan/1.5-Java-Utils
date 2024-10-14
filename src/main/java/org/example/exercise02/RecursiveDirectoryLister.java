package org.example.exercise02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class RecursiveDirectoryLister {
    // Formato de fecha para mostrar la fecha de última modificación
    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    // Método para listar de manera recursiva el árbol de directorios
    public void listDirectoryTree(String directoryPath, int level) {
        File directory = new File(directoryPath);

        // Comprobar si la ruta es un directorio
        if (directory.isDirectory()) {
            File[] contents = directory.listFiles(); // Listar los archivos y subdirectorios
            if (contents != null) {
                Arrays.sort(contents); // Ordenar los contenidos alfabéticamente
                for (File file : contents) {
                    // Imprimir la sangría correspondiente al nivel
                    for (int i = 0; i < level; i++) {
                        System.out.print("  ");
                    }

                    // Imprimir el nombre del archivo o directorio y su fecha de última modificación
                    if (file.isDirectory()) {
                        System.out.println("(D) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                        // Llamar recursivamente a listDirectoryTree para los subdirectorios
                        listDirectoryTree(file.getAbsolutePath(), level + 1);
                    } else {
                        System.out.println("(F) " + file.getName() + " - Last modified: " + sdf.format(file.lastModified()));
                    }
                }
            }
        } else {
            // Mensaje si la ruta proporcionada no es un directorio
            System.out.println("The provided path is not a directory.");
        }
    }
}

