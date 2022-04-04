package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_16_While_Do_While;

public class Exerc02_Do_while {
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
