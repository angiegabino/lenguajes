
package cajero;

/**
 *
 * @author Angie
 */
public class Cuenta {
    float saldo ;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoNegativoException {
        if(saldo < 0) throw new SaldoNegativoException();
        else{ this.saldo = saldo; 
        System.out.println("Saldo suficiente");}
    }
        
    public class SaldoNegativoException extends Exception {
        public SaldoNegativoException(){
            super("Saldo insuficiente");
            System.out.println("Saldo insuficiente");
        }
    }
}
