import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = null;
        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;

        while (true) {
            int op = Integer.parseInt(showInputDialog("Escolha entre as opções: \n 1 - Abrir conta \n 2 - Fechar conta \n 3 - Depósito \n 4 - Saque \n 5 - Transferência \n 6 - Sair"));

            switch (op) {
                case 1:
                    cliente = new Cliente(
                        showInputDialog("Digite o nome do cliente:"),
                        showInputDialog("Digite o CPF do cliente:"),
                        showInputDialog("Digite o endereço do cliente:"),
                        showInputDialog("Digite o telefone do cliente:")
                    );

                    contaCorrente = new ContaCorrente(
                        showInputDialog("Digite o número da conta corrente:"),
                        cliente,
                        Double.parseDouble(showInputDialog("Digite o limite da conta corrente:"))
                    );

                    contaPoupanca = new ContaPoupanca(
                        showInputDialog("Digite o número da conta poupança:"),
                        cliente,
                        Double.parseDouble(showInputDialog("Digite a taxa de juros:"))
                    );

                    showMessageDialog("Conta aberta!");
                    break;

                case 2:
                    if (contaCorrente != null && contaPoupanca != null) {
                        contaCorrente = null;
                        contaPoupanca = null;
                        cliente = null;
                        showMessageDialog("Sucesso!");
                    } else {
                        showMessageDialog("Abra a conta");
                    }
                    break;

                case 3:
                    if (contaCorrente != null) {
                        contaCorrente.depositar(Double.parseDouble(showInputDialog("Digite o valor do depósito:")));
                        showMessageDialog("Sucesso");
                    } else {
                        showMessageDialog("Abra a conta");
                    }
                    break;

                case 4:
                    if (contaCorrente != null) {
                        contaCorrente.sacar(Double.parseDouble(showInputDialog("Digite o valor do saque:")));
                        showMessageDialog("Sucesso!");
                    } else {
                        showMessageDialog("Abra a conta");
                    }
                    break;

                case 5:
                    if (contaCorrente != null && contaPoupanca != null) {
                        contaCorrente.transferir(Double.parseDouble(showInputDialog("Digite o valor da transferência:")), contaPoupanca);
                        showMessageDialog("Sucesso");
                    } else {
                        showMessageDialog("Abra a conta");
                    }
                    break;

                case 6:
                    showMessageDialog("Sair");
                    System.exit(0);
                    break;
            }
        }
    }

    private static String showInputDialog(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
