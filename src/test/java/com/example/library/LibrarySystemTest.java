package test.java.com.example.library;

import main.java.com.example.library.LibrarySystem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibrarySystemTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); // Redirects standard output to the outputStreamCaptor
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut); // Restores standard output to its original state
    }

    @Test
    void testAddNewItem() {
        String input = "A\n123\nClean Code\nRobert C. Martin\nQ\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        LibrarySystem.main(new String[]{});

        assertTrue(outputStreamCaptor.toString().contains("Enter Item ID, Title, Author:"));
        assertTrue(outputStreamCaptor.toString().contains("ItemID: 123, Title: Clean Code, Author: Robert C. Martin"));
    }

    @Test
    void testRemoveItem() {
        String initialInput = "A\n321\nEffective Java\nJoshua Bloch\nQ\n";
        System.setIn(new ByteArrayInputStream(initialInput.getBytes()));
        LibrarySystem.main(new String[]{}); // Add item first

        String removalInput = "R\n321\nQ\n";
        System.setIn(new ByteArrayInputStream(removalInput.getBytes()));
        LibrarySystem.main(new String[]{}); // Now remove it

        assertTrue(outputStreamCaptor.toString().contains("Enter Item ID to remove:"));
        assertTrue(outputStreamCaptor.toString().contains("Removed: ItemID: 321, Title: Effective Java, Author: Joshua Bloch"));
    }

    @Test
    void testDisplayItems() {
        String input = "A\n123\nClean Code\nRobert C. Martin\nD\nQ\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        LibrarySystem.main(new String[]{});

        assertTrue(outputStreamCaptor.toString().contains("ItemID: 123, Title: Clean Code, Author: Robert C. Martin"));
    }
}
