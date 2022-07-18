package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_38;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public Aluno() {
        super(); // chama o construtor da superclasse (pessoa); usa-se sempre que for fazer acesso à super classe
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    // this = referência na própria classe
    // super = referência à super classe

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("6565");
        this.setCpf("24546");
    }
}
