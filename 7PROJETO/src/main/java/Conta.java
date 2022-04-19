import javax.swing.*;

public class Conta {
    int numero;
    String titular;
    private double saldo; 

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    boolean saque (double valor){
        if(this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean deposita(double quantidade){
        this.saldo = this.saldo + quantidade;
            return true;
    
    }
        
}
