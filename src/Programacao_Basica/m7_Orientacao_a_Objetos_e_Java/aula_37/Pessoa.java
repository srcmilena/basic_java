package programacao_basica.m7_orientacao_a_objetos_e_java.aula_37;

// pessoa é: superclasse, classe mãe/pai
public class Pessoa {

    // as classes que herdarem esses atributos, não terão acesso pois eles são private e sim apenas aos getters e setters
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    private String telefoneCelular;

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
