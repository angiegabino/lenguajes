
package colecciones;

/**
 *
 * @author Angie
 */
public class Usuario {
    int id;
    String nombre;
    String paterno;
    String email;
    float sueldo;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String paterno, String email, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.email = email;
        this.sueldo = sueldo;
    }
    

    /*Este es el método getId(), si lo aplicas sobre un objeto de esta clase te 
    *regresa el id, que previamente ya quedo ajustado por el método setId()
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", email=" + email + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
