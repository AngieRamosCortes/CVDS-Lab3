package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void shouldAddNewBook() {
        Library library = new Library();
        Book book = new Book("Title1", "Author1", "ISBN1");
        assertTrue(library.addBook(book), "The book should be added successfully.");
    }

    @Test
    public void shouldIncreaseQuantityIfBookExists() {
        Library library = new Library();
        Book book = new Book("Title1", "Author1", "ISBN1");
        library.addBook(book);
        assertTrue(library.addBook(book), "The quantity of the book should increase.");
    }

    @Test
    public void shouldNotAddNullBook() {
        Library library = new Library();
        assertFalse(library.addBook(null), "Adding a null book should return false.");
    }

}
