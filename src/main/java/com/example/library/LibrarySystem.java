package main.java.com.example.library;

import java.util.Scanner;

/**
 * A simple command-line interface to interact with the library catalog.
 * Allows users to add items, remove items, and display all items in the catalog.
 */
public class LibrarySystem {
    private static final Catalog<LibraryItem> catalog = new Catalog<>();

    /**
     * The main method that starts the user interaction loop.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Choose an option: Add (A), Remove (R), Display (D), Quit (Q)");
            String option = scanner.nextLine();
            switch (option.toUpperCase()) {
                case "A":
                    addNewItem(scanner);
                    break;
                case "R":
                    removeItem(scanner);
                    break;
                case "D":
                    catalog.displayItems();
                    break;
                case "Q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

    /**
     * Handles the addition of a new library item via the command-line interface.
     * @param scanner the scanner object for reading user input
     */
    private static void addNewItem(Scanner scanner) {
        System.out.println("Enter Item ID, Title, Author:");
        String itemID = scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        LibraryItem item = new LibraryItem(title, author, itemID);
        catalog.addItem(item);
    }

    /**
     * Handles the removal of a library item via the command-line interface.
     * @param scanner the scanner object for reading user input
     */
    private static void removeItem(Scanner scanner) {
        System.out.println("Enter Item ID to remove:");
        String itemID = scanner.nextLine();
        LibraryItem removedItem = catalog.removeItem(itemID);
        if (removedItem == null) {
            System.out.println("Item not found.");
        } else {
            System.out.println("Removed: " + removedItem);
        }
    }
}
