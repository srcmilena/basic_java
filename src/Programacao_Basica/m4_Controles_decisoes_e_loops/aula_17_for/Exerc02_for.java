package programacao_basica.m4_controles_decisoes_e_loops.aula_17_for;

public class Exerc02_for {

    public static void main(String[] args) {

        // for com mais de uma variável
        for (int i = 0, j = 10; i < j; i++, j--) {

            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }
    }
}
