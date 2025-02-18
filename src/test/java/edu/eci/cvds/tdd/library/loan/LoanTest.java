package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Loan.
 * Verifica el correcto funcionamiento de los métodos getter y setter.
 */
public class LoanTest {
    private Loan loan;
    private Book book;
    private User user;

    /**
     * Configuración inicial antes de cada prueba.
     * Inicializa un libro, un usuario y un préstamo.
     */
    @BeforeEach
    public void setUp() {
        book = new Book("Programacion", "Alexa", "2312312h3j1"); // Se crea un libro con título, autor e ID
        user = new User(); // Se crea un usuario (debe asegurarse que tenga un constructor por defecto o implementado)
        loan = new Loan(); // Se crea un préstamo vacío
    }

    /**
     * Prueba para verificar que se pueda asignar y obtener un libro en el préstamo.
     */
    @Test
    public void testSetAndGetBook() {
        loan.setBook(book);
        assertEquals(book, loan.getBook());
    }

    /**
     * Prueba para verificar que se pueda asignar y obtener un usuario en el préstamo.
     */
    @Test
    public void testSetAndGetUser() {
        loan.setUser(user);
        assertEquals(user, loan.getUser());
    }

    /**
     * Prueba para verificar que se pueda asignar y obtener la fecha de préstamo.
     */
    @Test
    public void testSetAndGetLoanDate() {
        LocalDateTime now = LocalDateTime.now();
        loan.setLoanDate(now);
        assertEquals(now, loan.getLoanDate());
    }

    /**
     * Prueba para verificar que se pueda asignar y obtener el estado del préstamo.
     */
    @Test
    public void testSetAndGetStatus() {
        loan.setStatus(LoanStatus.ACTIVE);
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    }

    /**
     * Prueba para verificar que se pueda asignar y obtener la fecha de devolución del préstamo.
     */
    @Test
    public void testSetAndGetReturnDate() {
        LocalDateTime returnDate = LocalDateTime.now().plusDays(14);
        loan.setReturnDate(returnDate);
        assertEquals(returnDate, loan.getReturnDate());
    }
}