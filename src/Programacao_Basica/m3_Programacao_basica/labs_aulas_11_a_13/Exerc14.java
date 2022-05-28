/*
* 14 - Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps). Calcule e informe o tempo aproximado de download do arquivo usando este link(em minutos)
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoMB = scan.nextDouble();

        System.out.print("Digite a velocidade do link da internet em Mbps: ");
        double velocidadeMbps = scan.nextDouble();

        System.out.println("O tempo aproximado de download é: " + tamanhoMB/velocidadeMbps + " minutos");
    }
}
