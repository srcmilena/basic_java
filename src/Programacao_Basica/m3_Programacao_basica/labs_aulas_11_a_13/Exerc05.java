/*
* 5 - Faça um programa que converta metros para centímetros
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o comprimento em metros: ");
        float metro = scan.nextFloat();

        float conversor = metro * 100;

        System.out.print("O comprimento em centímentos é: " + conversor);
    }
}
