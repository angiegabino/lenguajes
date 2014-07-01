
package ETE;

import ETE.Nomina.SaldoFueradeRangoException;


public class TestNomina {

    public static void main (String args []){
        //Nomina n1 = new Nomina(20000, 1);
        //Nomina n2 = new Nomina(27496.50, 2);
        
        try {
            Nomina n1 = new Nomina (20000 , 1);
            n1.setSaldo(20000);
            n1.setIdTrabajador(1);
            
            Nomina n2 = new Nomina((float) 26749.50, 2);
            n2.setSaldo((float) 26749.50);
            n2.setIdTrabajador(2);
            
        }
        catch (SaldoFueradeRangoException e) {
            System.out.println(e.getMessage);
        }
        
    }          

}