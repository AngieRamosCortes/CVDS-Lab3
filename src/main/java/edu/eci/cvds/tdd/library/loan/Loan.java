package edu.eci.cvds.tdd.library.loan;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.user.User;

import java.time.LocalDateTime;

/**
 * Representa un préstamo de un libro en la biblioteca.
 * Contiene información sobre el libro prestado, el usuario que lo toma prestado,
 * las fechas del préstamo y devolución, y el estado del préstamo.
 */
public class Loan {
    private Book book; // Libro asociado al préstamo
    private User user; // Usuario que realizó el préstamo
    private LocalDateTime loanDate; // Fecha en la que se realizó el préstamo
    private LoanStatus status; // Estado del préstamo (por ejemplo, activo o finalizado)
    private LocalDateTime returnDate; // Fecha esperada de devolución

    /**
     * Obtiene el libro asociado al préstamo.
     *
     * @return El libro prestado.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Asigna un libro al préstamo.
     *
     * @param book El libro que se prestará.
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * Obtiene el usuario que realizó el préstamo.
     *
     * @return El usuario que tomó el libro en préstamo.
     */
    public User getUser() {
        return user;
    }

    /**
     * Asigna un usuario al préstamo.
     *
     * @param user El usuario que realizará el préstamo.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Obtiene la fecha en que se realizó el préstamo.
     *
     * @return La fecha de préstamo.
     */
    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    /**
     * Asigna la fecha en que se realizó el préstamo.
     *
     * @param loanDate La fecha del préstamo.
     */
    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * Obtiene el estado actual del préstamo.
     *
     * @return El estado del préstamo.
     */
    public LoanStatus getStatus() {
        return status;
    }

    /**
     * Asigna el estado del préstamo.
     *
     * @param status El nuevo estado del préstamo.
     */
    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    /**
     * Obtiene la fecha esperada de devolución del libro.
     *
     * @return La fecha de devolución.
     */
    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    /**
     * Asigna la fecha de devolución del libro.
     *
     * @param returnDate La fecha esperada de devolución.
     */
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
