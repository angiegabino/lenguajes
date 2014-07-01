
package ETE;

import cajero.Cuenta;


public class Nomina {
    float saldo;
    int idTrabajador;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoFueradeRangoException {
        if(saldo < 20000 || saldo > 25000) throw new SaldoFueradeRangoException();
        //else if  (saldo > 25000) throw new SaldoFueradeRangoException();
        else this.saldo = saldo;
    
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    public Nomina(){
        
    }
    
    public Nomina(float saldo, int idTrabajador){
        this.saldo = saldo;
        this.idTrabajador=idTrabajador;
    }

    public class SaldoFueradeRangoException extends Exception {
        boolean getMessage;
        public SaldoFueradeRangoException(){
            super("Fuera de rango");
        }
    }
}
