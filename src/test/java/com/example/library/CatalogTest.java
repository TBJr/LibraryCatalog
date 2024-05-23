package test.java.com.example.library;

import main.java.com.example.library.Catalog;
import main.java.com.example.library.LibraryItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {
    private Catalog<LibraryItem> catalog;

    @BeforeEach
    void setUp() {
        catalog = new Catalog<>();
        catalog.addItem(new LibraryItem("Book1", "Author1", "1"));
    }

    @Test
    void testAddItem() {
        LibraryItem newItem = new LibraryItem("Book2", "Author2", "2");
        catalog.addItem(newItem);
        assertEquals(newItem, catalog.getItem("2"), "The item should be added to the catalog.");
    }

    @Test
    void testRemoveItem() {
        LibraryItem removedItem = catalog.removeItem("1");
        assertNotNull(removedItem, "The item should exist and be removed.");
        assertNull(catalog.getItem("1"), "The item should no longer exist in the catalog.");
    }

    @Test
    void testRemoveNonExistentItem() {
        LibraryItem removedItem = catalog.removeItem("999");
        assertNull(removedItem, "Removing a non-existent item should return null.");
    }

    @Test
    void testGetItem() {
        LibraryItem item = catalog.getItem("1");
        assertNotNull(item, "The item should exist in the catalog.");
        assertEquals("Book1", item.getTitle(), "The title of the item should match.");
    }
}
