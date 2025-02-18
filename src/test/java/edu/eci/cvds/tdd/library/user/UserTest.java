package edu.eci.cvds.tdd.library.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        // Inicializa un nuevo usuario antes de cada prueba
        user = new User();
    }

    @Test
    public void testSetAndGetName() {
        // Verifica que se pueda establecer y obtener el nombre
        String name = "Juan Pérez";
        user.setName(name);
        assertEquals(name, user.getName());
    }

    @Test
    public void testSetAndGetId() {
        // Verifica que se pueda establecer y obtener el ID
        String id = "12345";
        user.setId(id);
        assertEquals(id, user.getId());
    }
}
