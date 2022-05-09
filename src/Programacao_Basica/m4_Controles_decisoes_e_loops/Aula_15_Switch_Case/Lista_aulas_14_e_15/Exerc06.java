/*
* 6. Faça um programa que leia três números e mostre o maior deles.
*/
package programacao_basica.m4_controles_decisoes_e_loops.aula_15_switch_case.lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o 1o número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o 2o número: ");
        int n2 = scan.nextInt();
        System.out.println("Digite o 3o número: ");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O 1o n° é o maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O 2o n° é o maior");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O 3o n° é o maior");
        }
    }
}
