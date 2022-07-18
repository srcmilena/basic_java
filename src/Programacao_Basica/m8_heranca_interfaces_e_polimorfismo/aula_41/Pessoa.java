package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_41;

public abstract class Pessoa { // abstract = não pode ter instancia dessa classe, apenas a classe filha que estende a essa clase que podem ser instanciadas

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telefoneCelular;

    protected String nomeVisibilidade;

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

    public abstract String obterEtiquetaEndereco(); // abstract também pode ser utilizada para métodos

    public abstract void imprimirEtiquetaEndereco(); // se não declarar nas outras classes, vai dar um erro
}

