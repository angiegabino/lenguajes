

package proyecto_final;

/**
 *
 * @author Angie
 */
public class ProyectoFinal {
    //No pueden haber más de una clase con método main
    public static void main (String args []){
        //Primero creamos una cuenta 
        Cuenta c = new Cuenta("Nomina", 123, 50000);
        Persistencia p = new Persistencia();
        p.guardar(c);
        
    }
}
