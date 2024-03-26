public class Funcionario {
    // Atributos privados da classe Funcionario
    private String nome;
    private String cpf;
    private double salario;

    // Construtor da classe Funcionario que recebe nome, CPF e salário como parâmetros
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Método getter para obter o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Método getter para obter o CPF do funcionário
    public String getCpf() {
        return cpf;
    }

    // Método setter para definir o CPF do funcionário
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método getter para obter o salário do funcionário
    public double getSalario() {
        return salario;
    }

    // Método setter para definir o salário do funcionário
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}