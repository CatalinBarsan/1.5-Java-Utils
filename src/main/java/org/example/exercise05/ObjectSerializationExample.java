package org.example.exercise05;

import java.io.*;

// Define a Book class that implements Serializable
class Book implements Serializable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

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

    public static void main(String[] args) {
        if (args.length > 0) {
            String filePath = args[0];
            Book book = new Book("1984", "George Orwell");
            serializeObject(book, filePath); // Serialize the book
            deserializeObject(filePath);      // Deserialize the book
        } else {
            System.out.println("Please provide a file path for serialization.");
        }
    }
}


