package edu.eci.cvds.tdd.library.book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Book.
 * Verifica que los atributos del libro se asignen y recuperen correctamente.
 */
public class BookTest {

    /**
     * Prueba para verificar que el constructor de Book asigne correctamente
     * los valores de título, autor e ISBN y que los métodos getter los devuelvan correctamente.
     */
    @Test
    void shouldGetIsbn() {
        // Creación de un libro con título, autor e ISBN
        Book book = new Book("Programacion", "Alexa", "2312312h3j1");

        // Verificación de los valores asignados
        assertEquals("Programacion", book.getTittle()); // Se asume que el método correcto es getTitle()
        assertEquals("Alexa", book.getAuthor());
        assertEquals("2312312h3j1", book.getIsbn());
    }
}
