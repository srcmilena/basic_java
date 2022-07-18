package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_42;

public class Aluno {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        //this.nomeVisibilidade = "defssf";
        //super.nomeVisibilidade = "dsfesde";

        //this.setNomeVisibilidade("uahuos");
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        //this.curso = curso;
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
        //super.setCpf("6565");
        //this.setCpf("24546");
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do aluno: ";
        //s += this.getEndereco();

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
