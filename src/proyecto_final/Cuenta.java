
package proyecto_final;

import java.io.Serializable; //Paquete para convertir clase serializada
import java.io.*;

/**
 *
 * @author Angie
 * 1. Agregar setters y getters 
 * 2. Agregarle constructor que inicializa los atributos
 * 3. Sobreescribir el método toString()
 * 4. Encapsular
 * 5. Preparar la clase para ser serializada (comprimida)
 * 
 */

//Implemetar el paquete "implements Serializable"
public class Cuenta implements Serializable{ 
//Con "private" hago encapsulación 
    private String nombre;
    private int numero;
    private float saldo;
    
    //Constructor por defecto
    public Cuenta(){
       
    }
    
     //Cosntructor con atributos
    public Cuenta (String nombre, int numero, float saldo){
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }
    
// Inicio getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
      
    //toString()
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    
}
