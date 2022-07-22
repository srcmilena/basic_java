package programacao_basica.m7_orientacao_a_objetos_e_java.aula_34;

public class MinhaCalculadora { // classe utilitária (quebra um pouco da oo)

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) { // é necessário que haja a troca do TIPO e não NOME do parâmetro
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteiros) { // static auxília no acesso dos métodos
        int total = 0;
        for (int i = 0; i< vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }
}
