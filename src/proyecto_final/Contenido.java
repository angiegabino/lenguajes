package proyecto_final;
import java.io.Serializable;
/**
 *
 * @author Angie
 */
public class Contenido implements Serializable  {
    
    private int id;
    private String nombre;
    private String cancion;
    private String album;
 
    @Override
    public String toString() {
        return "Contenido{" + "id=" + id + ", nombre=" + nombre + ", cancion=" + cancion + ", album=" + album + '}';
    }
    
    public Contenido() {
    }

    public Contenido(int id, String nombre, String cancion, String album, int año) {
        this.id = id;
        this.nombre = nombre;
        this.cancion = cancion;
        this.album = album;
       
    }

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

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
  
}
