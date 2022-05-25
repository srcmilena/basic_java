/*
* 9 - Faça um programa quepeça a temperatura em graus Farenheit transforme e mostre a temperatura em graus Celsius
* ºC = (5 * (F - 32) / 9)
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {

        Scanner scanning = new Scanner(System.in);
        System.out.print("Quantos graus em Farenheit? ");
        double farenheit = scanning.nextDouble();

        double celsius = (5*(farenheit-32)/9);

        System.out.print("Transformando em Celsius, fica: " + celsius);
    }
}
