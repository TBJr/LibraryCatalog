package test.java.com.example.library;

import main.java.com.example.library.LibraryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryItemTest {
    @Test
    void testLibraryItemConstructorAndProperties() {
        String title = "Effective Java";
        String author = "Joshua Bloch";
        String itemID = "123";

        LibraryItem item = new LibraryItem(title, author, itemID);

        // Test that the constructor properly assigns properties
        assertAll("Constructor should set all properties",
                () -> assertEquals(title, item.getTitle(), "Title should match the input provided."),
                () -> assertEquals(author, item.getAuthor(), "Author should match the input provided."),
                () -> assertEquals(itemID, item.getItemID(), "ItemID should match the input provided.")
        );
    }

    @Test
    void testToString() {
        String title = "Clean Code";
        String author = "Robert C. Martin";
        String itemID = "321";
        LibraryItem item = new LibraryItem(title, author, itemID);

        String expectedString = "ItemID: 321, Title: Clean Code, Author: Robert C. Martin";

        // Test that toString() returns the correct string representation
        assertEquals(expectedString, item.toString(), "toString should return the correct string representation of the item.");
    }
}
