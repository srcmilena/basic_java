/*
* 8 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu sálario no referido mês
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalhou por mês? ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.print("O seu salário é: " + salario + " reais");
    }
}
