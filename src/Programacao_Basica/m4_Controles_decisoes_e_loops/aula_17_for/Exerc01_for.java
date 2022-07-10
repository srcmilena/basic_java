package programacao_basica.m4_controles_decisoes_e_loops.aula_17_for;

public class Exerc01_for {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // é comum utilizar o contador iniciando em zero
            // a iniciacialização da variável "i" dentro do escopo do for, permite que "i" funcione apenas dentro do bloco

            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i > 0; i--) {

            System.out.println("i tem valor: " + i);
        }
    }
}
