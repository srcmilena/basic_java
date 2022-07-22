package programacao_basica.m7_orientacao_a_objetos_e_java.aula_36;

public class Contato {

    //declarando atributos
    private String nome;
    private Endereco endereco;
    //private Contato telefone;
    private Telefone[] telefones; // não usamos arrays para coleções de objetos

    //gerando getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
