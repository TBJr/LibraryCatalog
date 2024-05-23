# Library Catalog System

The Library Catalog System is a Java-based application that allows users to manage a catalog of library items through a command-line interface. This system supports adding, removing, and displaying items, such as books, DVDs, and magazines.

## Features

- **Add Items**: Insert new library items with unique identifiers.
- **Remove Items**: Remove items from the catalog using their unique identifiers.
- **Display Items**: View all items currently stored in the catalog.

## Getting Started

### Prerequisites

Ensure you have the following installed:
- Java JDK 11 or newer
- Maven (optional, for managing dependencies and running the application)

### Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/TBJr/LibraryCatalog.git
cd LibraryCatalog
```

### Build
Compile the project using Java compiler or Maven:

```bash
## If using Java compiler
javac -d ./bin src/main/java/com/example/library/*.java

# If using Maven
mvn compile
```

### Run the Application
### Run the compiled classes using the Java interpreter or Maven:
```bash
## If using Java
java -cp ./bin com.example.library.LibrarySystem

## If using Maven
mvn exec:java -Dexec.mainClass="com.example.library.LibrarySystem"
```
### Usage
Once the application is running, you will be prompted with options to add, remove, or display library items. Follow the on-screen prompts to interact with the catalog.

### Testing
Run the tests to ensure the application is functioning as expected:
```bash
# If using Java
# Ensure your tests are compiled and run them using Java's test runner

# If using Maven
mvn test
```

### Contributing
Contributions are welcome. Please fork the repository and submit a pull request with your features or fixes.

### License
This project is licensed under the MIT License - see the LICENSE.md file for details.

### Authors
Thomas S Brown - Initial work - TBJr

### Acknowledgments
- Hat tip to anyone whose code was used
- Inspiration
- etc

### Notes on the README.md

- **General Information**: The document starts with a brief description of the project, outlining its main functionality.
- **Getting Started**: This section covers the prerequisites, installation steps, and how to build and run the application.
- **Usage**: Explains how to use the application, which is crucial for end users.
- **Testing**: Instructions on how to run tests to validate the installation and functionality.
- **Contributing**: Encourages other developers to contribute to the project, which is important for open-source projects.
- **License**: Specifies the license under which the project is released.
- **Authors and Acknowledgments**: Credits to the creator and contributors, which is a good practice.

Make sure to replace placeholders like repository links and usernames with actual data specific to your project. This README will help users and developers understand and engage with your project effectively.