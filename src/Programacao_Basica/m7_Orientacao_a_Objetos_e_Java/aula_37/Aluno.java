package programacao_basica.m7_orientacao_a_objetos_e_java.aula_37;

// aluno é: classe filho, classe herdeira
public class Aluno extends Pessoa { // extends = palavra chave que demonstra o uso de herança; Se extende a outra classe
    // passará a ter acesso aos atributos da classe pessoa

    private String curso;
    private double[] notas;


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
}
