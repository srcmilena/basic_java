/*
* 12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 72.78*altura) - 58
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        double altura = scan.nextFloat();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
