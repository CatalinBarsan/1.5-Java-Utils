# 📄 Description

This project consists of several exercises that work with file and directory manipulation in Java. The exercises are as follows:

- **Exercise 1:** Create a class that lists the contents of a directory received as a parameter in alphabetical order.
- **Exercise 2:** Add to the previous class the functionality to list a directory tree with the content of all its levels (recursively) so that it is printed on the screen in alphabetical order within each level, also indicating if it is a directory (D) or a file (F), and its last modification date.
- **Exercise 3:** Modify the previous exercise. Now, instead of displaying the result on the screen, save the output to a TXT file.
- **Exercise 4:** Add functionality to read any TXT file and display its content on the console.
- **Exercise 5:** The program must now serialize a Java object to a `.ser` file and then deserialize it.

## 💻 Technologies Used

- Java JDK 22
- IntelliJ IDEA
- Maven

## 📋 Requirements

- JDK 22 or higher installed.
- IntelliJ IDEA or any other Java-compatible IDE.
- Maven dependencies configured.

## 🛠️ Installation

1. Clone the repository to your local machine using the command:
   ```bash
   git clone https://github.com/CatalinBarsan/1.5-Java-Utils.git
   ```
2. Navigate to the project directory:
   ```bash
   cd src/main/resources/Directory01
   ```
3. If using Maven, run the following command to download dependencies:
   ```bash
   mvn install
   ```

## ▶️ Execution

To execute the exercises, follow these steps:

- **Exercise 1:**

Navigate to the source folder:

Open a terminal/command prompt and navigate to the src/main/java directory where the Java source files are located.

Compile the Java files:

Run the following command to compile all the Java files:

```bash
javac org/example/exercise01/*.java
  ```

Execution
After successful compilation, execute the program using the following command:

```bash
java org.example.exercise01.Main "../resources/Directory01"
```

- **Exercise 2:**

Navigate to the source folder:

Open a terminal/command prompt and navigate to the src/main/java directory where the Java source files are located.

Compile the Java files:

Run the following command to compile all the Java files:

```bash
javac org/example/exercise02/*.java
  ```

Execution
After successful compilation, execute the program using the following command:

```bash
java org.example.exercise02.Main "../resources/Directory01"
```

- **Exercise 3:**

Navigate to the source folder:

Open a terminal/command prompt and navigate to the src/main/java directory where the Java source files are located.

Compile the Java files:

Run the following command to compile all the Java files:

```bash
javac org/example/exercise02/*.java
  ```

Execution
After successful compilation, execute the program using the following command:

```bash
java org.example.exercise03.Main "../resources/Directory01" "output.txt"
```

- **Exercise 4:**

Navigate to the source folder:

Open a terminal/command prompt and navigate to the src/main/java directory where the Java source files are located.

Compile the Java files:

Run the following command to compile all the Java files:

```bash
javac org/example/exercise04/*.java
  ```

Execution
After successful compilation, execute the program using the following command:

```bash
java org.example.exercise02.Main "../resources/Directory01/archivo1" 
```
- **Exercise 5:**

Navigate to the source folder:

Open a terminal/command prompt and navigate to the src/main/java directory where the Java source files are located.

Compile the Java files:

Run the following command to compile all the Java files:

```bash
javac org/example/exercise05/ObjectSerializationExample.java
  ```

Execution
After successful compilation, execute the program using the following command:

```bash
java org.example.exercise05.ObjectSerializationExample "../resources/book.ser"
```

## 🌐 Deployment

To deploy the project in a production environment, follow these steps:

1. Ensure all dependencies are correctly installed.
2. Compile the project using:
   ```bash
   mvn clean package
   ```
3. Copy the resulting JAR file to the production server and run it with:
   ```bash
   java -jar <file-name>.jar
   ```

## 🤝 Contributions

If you want to contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch for your changes:
   ```bash
   git checkout -b my-new-feature
   ```
3. Make your changes and commit:
   ```bash
   git commit -m 'Added a new feature'
   ```
4. Push your branch to the remote repository:
   ```bash
   git push origin my-new-feature
   ```
5. Create a Pull Request to have your changes reviewed.