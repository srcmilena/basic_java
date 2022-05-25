/*
* 10 - Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos graus em Celsius? ");
        double celsius = scan.nextDouble();

        double farenheit = (9/5*celsius) + 32;

        System.out.print("Os graus em Farenheit são: " + farenheit);
    }
}
