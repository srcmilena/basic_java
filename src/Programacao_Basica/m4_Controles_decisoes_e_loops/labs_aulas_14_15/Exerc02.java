/*
* 2 - Faça um programa que peça um valor e mostre na tela se o valor positivo ou negativo
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if (num > 0) {

            System.out.print("O número é positivo");
        } else {

            System.out.print("O número é negativo");
        }
    }
}
