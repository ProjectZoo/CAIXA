import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = null;
        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;

        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha entre as opções: \n 1 - Abrir conta \n 2 - Fechar conta \n 3 - Depósito \n 4 - Saque \n 5 - Transferência \n 6 - Sair"));

            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
                    String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente:");
                    String endereco = JOptionPane.showInputDialog(null, "Digite o endereço do cliente:");
                    String telefone = JOptionPane.showInputDialog(null, "Digite o telefone do cliente:");
                    cliente = new Cliente(nome, cpf, endereco, telefone);

                    String numeroConta = JOptionPane.showInputDialog(null, "Digite o número da conta corrente:");
                    double limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite da conta corrente:"));
                    contaCorrente = new ContaCorrente(numeroConta, cliente, limite);

                    String numeroContaPoupanca = JOptionPane.showInputDialog(null, "Digite o número da conta poupança:");
                    double taxaJuros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de juros da conta poupança:"));
                    contaPoupanca = new ContaPoupanca(numeroContaPoupanca, cliente, taxaJuros);

                    JOptionPane.showMessageDialog(null, "Conta aberta com sucesso!");
                    break;

                case 2:
                    if (contaCorrente != null && contaPoupanca != null) {
                        contaCorrente = null;
                        contaPoupanca = null;
                        cliente = null;
                        JOptionPane.showMessageDialog(null, "Conta fechada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há conta aberta para fechar!");
                    }
                    break;

                case 3:
                    if (contaCorrente != null) {
                        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito:"));
                        contaCorrente.depositar(valorDeposito);
                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há conta aberta para realizar o depósito!");
                    }
                    break;

                case 4:
                    if (contaCorrente != null) {
                        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque:"));
                        contaCorrente.sacar(valorSaque);
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há conta aberta para realizar o saque!");
                    }
                    break;

                case 5:
                    if (contaCorrente != null && contaPoupanca != null) {
                        double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da transferência:"));
                        contaCorrente.transferir(valorTransferencia, contaPoupanca);
                        JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há contas abertas para realizar a transferência!");
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nosso caixa virtual!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}