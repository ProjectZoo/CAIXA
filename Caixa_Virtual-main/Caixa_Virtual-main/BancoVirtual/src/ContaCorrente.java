import javax.swing.JOptionPane;
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite; 
    }
@Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        }else{ 
            JOptionPane.showMessageDialog(null, "Não tem");
    }
}
}