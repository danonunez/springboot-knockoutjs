package cl.danoespinoza.jframework.domain;

/**
 *
 * @author Dano Espinoza <dano@danoespinoza.cl>
 */
public class PersonaDummy {
    
    private String nombre;
    private String apellido;

    public PersonaDummy() {
    }

    public PersonaDummy(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaDummy{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
