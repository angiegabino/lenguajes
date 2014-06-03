
package gabino.angelica;


public class Animal {
    
    private String nombre;
    private float peso;
    private int edad;
    private boolean carnivoro;
    
    public Animal(int peso){//Consultor 
        this.peso=peso;
    }
    public Animal(String nombre, float peso){//Constructor
        nombre="Tigre";
        peso=85;
    }
    
    public Animal(){//constructor
        
    }
    
    public Animal(String nombre){//Constructor
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
    
}
