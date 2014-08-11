package proyecto_final;

/**
 *
 * @author Angie
 */

import java.io.Serializable; //Paquete para convertir clase serializada
import java.io.*;
import java.util.ArrayList;

public class Artista {
    private int id;
    private String nombre;
    private String cancion;
    private String album;
    private ArrayList<Contenido> contenidos;

    public Artista(int id, String nombre, ArrayList<Contenido> contenidos) {
        this.id = id;
        this.nombre = nombre;
        //this.cancion = cancion;
        //this.album = album;
        this.contenidos = contenidos;
    }

   
    public ArrayList<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
        this.album = album;
        this.cancion = cancion;
        

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
