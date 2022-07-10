package programacao_basica.m4_controles_decisoes_e_loops.aula_18_break;

import java.util.Scanner;

public class Exerc01_break {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        //int num = 100;

        for (int i = num; i <= max; i++) {
            if (i % 7 >= 0) {
                System.out.println("Valor de i: " + i);
                break; // quando quiser sair do for
            }

        }
    }
}
