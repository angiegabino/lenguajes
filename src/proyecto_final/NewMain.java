

package proyecto_final;

/**
 *
 * @author Angie
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c;
        Persistencia p = new Persistencia();
        c=p.leer();
//        Cuenta c = new Persistencia().leer();
        System.out.println(c);
    }
    
}
