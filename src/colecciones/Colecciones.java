

package colecciones;

import java.util.ArrayList;

/**
 *
 * @author Angie
 */
public class Colecciones {
    public static void main(String [] args){
        Usuario u1 = new Usuario();
        u1.setId(1);
        u1.setNombre("Angelica");
        u1.setPaterno("Gabino");
        u1.setEmail("angelicagabino@outlook.com");
        u1.setSueldo(10000);
        //System.out.println("Ya se guardo el objeto" + u1);
        
        Usuario u2= new Usuario(2, "Fernando", "Flores", "fernandoflores@gmail.com", 12000);
        Usuario u3= new Usuario(3, "Sergio", "Rodriguez", "sr@gmail.com", 11000);
        
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        for(Usuario u:usuarios){
        System.out.println(u);
    }
}
    
}
