package org.example.exercise05;

import java.io.*;

// Class for object serialization example
public class ObjectSerializationExample {

    // Method to serialize a Book object
    public static void serializeObject(Book book, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(book);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize a Book object
    public static void deserializeObject(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Book book = (Book) ois.readObject();
            System.out.println("Deserialized object: " + book);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
