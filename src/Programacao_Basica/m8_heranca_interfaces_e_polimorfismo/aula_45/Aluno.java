package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_45;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        this.nomeVisibilidade = "defssf";
        super.nomeVisibilidade = "dsfesde";

        this.setNomeVisibilidade("uahuos");
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

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

    public String obterEtiquetaEndereco() {
        //return endereco;
        String s = "Endereço do aluno: ";
        s += this.getEndereco(); // s += concatena

        return s;
    }
}
