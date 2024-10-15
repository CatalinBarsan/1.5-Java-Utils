package org.example.exercise05;

// Main class to run the serialization example
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String filePath = args[0];
            Book book = new Book("1984", "George Orwell");
            ObjectSerializationExample.serializeObject(book, filePath); // Serialize the book
            ObjectSerializationExample.deserializeObject(filePath);      // Deserialize the book
        } else {
            System.out.println("Please provide a file path for serialization.");
        }
    }
}
