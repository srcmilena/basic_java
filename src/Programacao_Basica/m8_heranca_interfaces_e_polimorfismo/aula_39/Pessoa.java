package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_39;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    protected String nomeVisibilidade;
    // modificador padrão = vísivel dentro do pacote
    // public = consegue ver mesmo se estiver em outro pacote
    // protected = funciona como o default, a diferença é que não importa onde as subclasses estejam, elas possuem acesso aos atributos e métodos

    public Pessoa() {}

    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

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

    public String getNomeVisibilidade() {
        return nomeVisibilidade;
    }

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }
}

