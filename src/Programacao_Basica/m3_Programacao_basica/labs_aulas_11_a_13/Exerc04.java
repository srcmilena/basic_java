/*
* 4 - Faça um programa que peça as 4 notas bimestraise mostre a média
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = scan.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = scan.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = scan.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota4 = scan.nextInt();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A média é: " + media); //Por que se digitar 6, 7, 5, 4 dá 5.0 e não 5.5?
    }
}
