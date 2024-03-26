import javax.swing.JOptionPane;

public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente cliente;

   
    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0; 
    }
    public void depositar(double valor) {
        saldo += valor; 
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor; 
        } else {
            JOptionPane.showMessageDialog(null, "Insuficiente!");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            saldo -= valor; 
            contaDestino.depositar(valor);
        } else {
            JOptionPane.showMessageDialog(null, "Insuficiente!");
        }
    }

}