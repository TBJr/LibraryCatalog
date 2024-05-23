package main.java.com.example.library;

/**
 * Base class for items that can be stored in a library catalog.
 * Includes common attributes such as title, author, and item ID.
 */
public class LibraryItem {
    private final String title;
    private final String author;
    private final String itemID;

    /**
     * Constructs a new LibraryItem with specified title, author, and item ID.
     * @param title the title of the library item
     * @param author the author of the library item
     * @param itemID the unique identifier for the library item
     */
    public LibraryItem(String title, String author, String itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Getter methods for properties
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getItemID() { return itemID; }

    /**
     * Returns a string representation of the library item.
     * Includes the item ID, title, and author.
     * @return a string representation of the item
     */
    @Override
    public String toString() {
        return "ItemID: " + itemID + ", Title: " + title + ", Author: " + author;
    }
}
