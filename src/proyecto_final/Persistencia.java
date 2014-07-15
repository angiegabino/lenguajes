

package proyecto_final;
import java.io.*; //Paquete que ayuda a guardar 

/**
 *
 * @author Angie
 * Esta clase ayuda a guardar el programa 
 */

public class Persistencia {
    
    Cuenta c ;
    
    //Método que va a guardar una cuenta 
    public void guardar(Cuenta c){
        try {
            //Paso 1 para guardar: Creamos el archivo físico
            File f = new File ("Archivo.ext");
            //Encadenamos el archivo a la salida
            FileOutputStream fos = new FileOutputStream(f);
            //Creamos el objeto a serializar 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
            System.out.println("Guardado con exito!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Cuenta leer(){
    Cuenta c = new Cuenta(); //Referencia, no objeto
    try{
        //Para leer un archivo casi son los mismos pasos
        //Paso 1: Abrir el archivo a leer
        File f = new File ("Archivo.ext");
        //Paso 2: El siguiente renglón indica que el archivo se leerá 
        FileInputStream fis = new FileInputStream(f); //Entra el archivo
        //Paso 3: Leemos el contenido
        ObjectInputStream ois = new ObjectInputStream(fis);
        c = (Cuenta) ois.readObject(); //Casting
    }
    
    catch(Exception e){
        
    }
    return c;
}
        
    
    
}
