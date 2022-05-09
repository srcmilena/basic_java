package programacao_basica.m4_controles_decisoes_e_loops.aula_16_while_do_while;

public class Exerc02_do_while {
    public static void main(String[] args) {


        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max) {
            System.out.println("Valor de i: " + i);
            i++;
        }
        System.out.println(i); //valor de 11

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 13);
        System.out.println(i);
    }
}
