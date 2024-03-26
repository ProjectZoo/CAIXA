public class ContaPoupanca extends Conta {
    // Atributo privado da classe ContaPoupanca
    private double taxaJuros;

    // Construtor da classe ContaPoupanca que recebe número, cliente e taxa de juros como parâmetros
    public ContaPoupanca(String numero, Cliente cliente, double taxaJuros) {
        super(numero, cliente); // Chama o construtor da classe pai (Conta)
        this.taxaJuros = taxaJuros; // Define a taxa de juros da conta poupança
    }

    // Método para aplicar juros ao saldo da conta poupança
    public void aplicarJuros() {
        double juros = saldo * taxaJuros / 100; // Calcula o valor dos juros com base na taxa e no saldo atual
        saldo += juros; // Adiciona os juros ao saldo da conta poupança
    }

}