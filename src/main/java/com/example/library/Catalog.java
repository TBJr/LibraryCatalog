package main.java.com.example.library;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a generic catalog capable of storing and managing different types of library items.
 * Utilizes a map for efficient item lookup by itemID.
 *
 * @param <T> the type of LibraryItem the catalog can store; must extend LibraryItem class
 */
public class Catalog<T extends LibraryItem> {
    private final Map<String, T> items = new HashMap<>();

    /**
     * Adds a library item to the catalog.
     * @param item the library item to add
     */
    public void addItem(T item) {
        items.put(item.getItemID(), item);
    }

    /**
     * Removes a library item from the catalog by its item ID.
     * @param itemID the unique ID of the item to remove
     * @return the removed item, or null if no item was found with the provided ID
     */
    public T removeItem(String itemID) {
        return items.remove(itemID);
    }

    /**
     * Retrieves a library item by its item ID.
     * @param itemID the unique ID of the item to retrieve
     * @return the item, or null if no item is found with the provided ID
     */
    public T getItem(String itemID) {
        return items.get(itemID);
    }

    /**
     * Displays all items in the catalog.
     * Outputs each item's details to the standard output.
     */
    public void displayItems() {
        items.values().forEach(System.out::println);
    }
}
