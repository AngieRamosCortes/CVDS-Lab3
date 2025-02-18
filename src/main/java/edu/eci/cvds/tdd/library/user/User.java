package edu.eci.cvds.tdd.library.user;

/**
 * Representa un usuario en la biblioteca.
 * Un usuario tiene un nombre y un identificador único.
 */
public class User {
    private String name;
    private String id;

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna un nombre al usuario.
     *
     * @param name El nombre del usuario.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return El ID del usuario.
     */
    public String getId() {
        return id;
    }

    /**
     * Asigna un identificador único al usuario.
     *
     * @param id El ID del usuario.
     */
    public void setId(String id) {
        this.id = id;
    }
}
