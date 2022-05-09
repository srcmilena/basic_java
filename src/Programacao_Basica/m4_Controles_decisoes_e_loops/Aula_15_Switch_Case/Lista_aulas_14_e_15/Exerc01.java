/*
* 1. Faça um programa que peça dois números e imprima o maior deles.
*/
package programacao_basica.m4_controles_decisoes_e_loops.aula_15_switch_case.lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é o maior");
        } else {
            System.out.println("O segundo número é o maior");
        }
    }
}
