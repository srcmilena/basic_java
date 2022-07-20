package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_43;

import java.util.Arrays;
import java.util.Objects;

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
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString() { // toString = método público
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas);
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        Aluno other = (Aluno) obj;

        if (curso.equalsIgnoreCase(other.getCurso())) {
            return true;
        }
    }*/
}
