import javax.swing.JOptionPane;

public abstract class Conta {
    // Atributos protegidos da classe Conta
    protected String numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor da classe Conta que recebe número e cliente como parâmetros
    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0; // Inicializa o saldo da conta como zero
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor; // Adiciona o valor ao saldo atual da conta
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor; // Subtrai o valor do saldo atual da conta, se houver saldo suficiente
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!"); // Exibe uma mensagem de saldo insuficiente, caso contrário
        }
    }

    // Método para transferir um valor desta conta para outra conta de destino
    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            saldo -= valor; // Subtrai o valor do saldo atual desta conta, se houver saldo suficiente
            contaDestino.depositar(valor); // Deposita o valor na conta de destino
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!"); // Exibe uma mensagem de saldo insuficiente, caso contrário
        }
    }

}