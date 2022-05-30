/*
* 6 - Faça um programa que leia três números e mostre o maior e o menor deles
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 & num1 > num3) {

            System.out.print("O primeiro número tem o maior valor");
        } else if (num2 > num1 & num2 > num3) {

            System.out.print("O segundo número tem o maior valor");
        } else if (num3 > num1 & num3 > num2) {

            System.out.print("O terceiro número tem o maior valor");
        } else {

            System.out.print("Os valor são inválidos ou iguais");
        }
    }
}
