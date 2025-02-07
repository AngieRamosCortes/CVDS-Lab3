package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

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

    @Test
    public void shouldLoanABookSuccessfully() {
        Library library = new Library();
        User user = new User();
        user.setId("123");
        user.setName("John Doe");
        library.addUser(user);
        Book book = new Book("Title1", "Author1", "ISBN1");
        library.addBook(book);

        Loan loan = library.loanABook("123", "ISBN1");
        assertNotNull(loan, "The loan should be created successfully.");
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    }

    @Test
    public void shouldNotLoanIfBookNotAvailable() {
        Library library = new Library();
        User user = new User();
        user.setId("123");
        library.addUser(user);

        Loan loan = library.loanABook("123", "ISBN1");
        assertNull(loan, "The loan should not be created if the book is not available.");
    }

    @Test
    public void shouldNotLoanIfUserAlreadyHasBook() {
        Library library = new Library();
        User user = new User();
        user.setId("123");
        library.addUser(user);
        Book book = new Book("Title1", "Author1", "ISBN1");
        library.addBook(book);
        library.loanABook("123", "ISBN1");

        Loan secondLoan = library.loanABook("123", "ISBN1");
        assertNull(secondLoan,
                "The loan should not be created if the user already has an active loan for the same book.");
    }
}
