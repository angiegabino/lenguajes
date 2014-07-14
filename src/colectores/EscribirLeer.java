
package colectores;

/**
 *
 * @author Angie
 */
import java.io.*;
public class EscribirLeer {
public static void main(String args[]){
    
    
    try {
        Alumno a = new Alumno("Erick", 10);
        File f = new File("Archivo.hola");
        FileOutputStream fos = new FileOutputStream (f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
    }
    catch (Exception e){
        
    }
}    
}
