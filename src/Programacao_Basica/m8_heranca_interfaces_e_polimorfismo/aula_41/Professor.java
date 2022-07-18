package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_41;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }

    public String obterEtiquetaEndereco() {
        //return endereco;
        String s = "Endereço do professor: ";
        s += this.getEndereco(); // s += concatena

        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
