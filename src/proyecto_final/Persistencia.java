

package proyecto_final;
import java.io.*; //Paquete que ayuda a guardar 
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Angie
 * Esta clase ayuda a guardar el programa 
 */

public class Persistencia {
    
 public synchronized static ArrayList<Artista> leer()throws Exception{
   File file = new File("Artista.menu");    
 
   FileInputStream fis = new FileInputStream(file);
   ObjectInputStream ois = new ObjectInputStream(fis);
   ArrayList<Artista> p = (ArrayList<Artista>) ois.readObject();
   ois.close();
   return p;
   }
    
public static void guardar(Artista p)throws Exception{
       
        ArrayList artistas = new ArrayList<Artista>();
        File file = new File("Artista.menu");    
        if(file.exists()){
        artistas =  leer();
        }
         
        FileOutputStream fis = new FileOutputStream(file);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
        artistas.add(p);
        ois.writeObject(artistas); 
        ois.close();
        System.out.println("Guardado");
    }
        
  //   public static Artista buscarPorid(){
  
  //}
    
}
