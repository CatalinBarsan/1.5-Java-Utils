package org.example.exercise02;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // Comprobar si se ha pasado un argumento
        if (args.length == 0) {
            System.out.println("Please provide a directory path as an argument.");
            return;
        }

        RecursiveDirectoryLister rcs = new RecursiveDirectoryLister();

        // Tomar el primer argumento como la ruta del directorio
        String directoryPath = args[0];

        // Llamar al método para listar el árbol de directorios
        rcs.listDirectoryTree(directoryPath, 0);
    }
}

