package programacao_basica.m7_orientacao_a_objetos_e_java.aula_33;

public class MinhaCalculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) { // é necessário que haja a troca do TIPO e não NOME do parâmetro
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros) {
        int total = 0;
        for (int i = 0; i< vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
