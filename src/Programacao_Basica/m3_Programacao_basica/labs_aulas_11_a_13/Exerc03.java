/*
* 3 - Faça um programa que peça dois números e imprima a soma
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite um segundo número: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.print("A soma desses dois valores é: " + soma);
    }
}
