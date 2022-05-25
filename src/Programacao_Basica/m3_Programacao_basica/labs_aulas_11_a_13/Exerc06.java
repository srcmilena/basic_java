/*
* 6 - Faça um programa que peça o raio de um círculo, calcule e mostre sua área
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextFloat();

        double area = 3.14 * (raio*raio);

        System.out.print("A área desse círculo é: " + area);
    }
}
