public class Cliente {
    // Atributos privados da classe Cliente
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    // Construtor da classe Cliente que recebe nome, CPF, endereço e telefone como parâmetros
    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método getter para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    // Método setter para definir o CPF do cliente
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método getter para obter o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Método setter para definir o endereço do cliente
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método getter para obter o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Método setter para definir o telefone do cliente
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}