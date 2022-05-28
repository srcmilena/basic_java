/*
* 13 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o imposto de renda, 8% para o INSS e 5% para o sindicato. Faça um programa que nos dê:
* a. Salário bruto;
* b. Quanto pagou ao INSS;
* c. Quando pagou ao sindicato;
* d. O salário líquido;
* e. Calcule os descontos e o salário líquido, conforme a tabela abaixo:
* + salário bruto: R$ - IR (11%): R$ - INSS (8%): R$ - sindicato (5%): R$ = salário líquido: RS
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas foram trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioTotal = valorHora*horasTrabalhadas;

        double descontoIR = salarioTotal*0.11;

        double descontoINSS = salarioTotal*0.08;

        double descontoSindicato = salarioTotal*0.05;

        double salarioLiquido = salarioTotal-descontoIR-descontoINSS-descontoSindicato;

        System.out.println("O salário bruto é: " + salarioTotal);
        System.out.println("O desconto do IR (11%) foi: " + descontoIR);
        System.out.println("O desconto do INSS (8%) foi: " + descontoINSS);
        System.out.println("O valor pago ao sindicato (5%) foi: " + descontoSindicato);
        System.out.println("O salário líquido é: " + salarioLiquido);
    }
}
