public class Agencia {
    // Atributos privados da classe Agencia
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor da classe Agencia que recebe nome, endereço e telefone como parâmetros
    public Agencia(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método getter para obter o nome da agência
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da agência
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o endereço da agência
    public String getEndereco() {
        return endereco;
    }

    // Método setter para definir o endereço da agência
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método getter para obter o telefone da agência
    public String getTelefone() {
        return telefone;
    }

    // Método setter para definir o telefone da agência
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}