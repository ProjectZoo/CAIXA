import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
    // Atributo privado da classe ContaCorrente
    private double limite;

    // Construtor da classe ContaCorrente que recebe número, cliente e limite como parâmetros
    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente); // Chama o construtor da classe pai (Conta)
        this.limite = limite; // Define o limite da conta corrente
    }

    // Sobrescreve o método sacar da classe pai (Conta)
    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor; // Subtrai o valor do saldo atual da conta corrente, se o saldo mais o limite forem suficientes
        } else {
            JOptionPane.showMessageDialog(null, "Saldo e limite insuficientes!"); // Exibe uma mensagem de saldo e limite insuficientes, caso contrário
        }
    }

}