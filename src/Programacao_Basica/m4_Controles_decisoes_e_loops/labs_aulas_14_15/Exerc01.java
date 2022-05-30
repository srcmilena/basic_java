/*
* 1 - Faça um programa que peça dois números e imprima o maior deles
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scan.nextInt();

        if (num1 >= num2) {

            System.out.print("O primeiro número é maior que o segundo");
        } else {

            System.out.print("O segundo número é maior que o primeiro");
        }
    }
}
