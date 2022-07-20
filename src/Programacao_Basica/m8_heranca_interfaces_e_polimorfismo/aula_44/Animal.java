package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_44;

public abstract class Animal {

    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
