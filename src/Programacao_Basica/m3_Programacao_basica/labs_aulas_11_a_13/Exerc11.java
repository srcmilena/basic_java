/*
* 11 - Faça um programa que peça 2 números inteiros e um número real.
* Calcule e mostre:
*   a. O produto do dobro do primeiro com metade do segundo.
*   b. A soma do triplo do primeiro com o terceiro.
*   c. O terceito elevado ao cubo.
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o primeiro número (inteiro): ");
    int primeiroNum = scan.nextInt();

    System.out.print("Digite o segundo número (inteiro): ");
    int segundoNum = scan.nextInt();

    System.out.print("Digite o terceiro número (real): ");
    double terceiroNum = scan.nextDouble();

    double produto = (2*primeiroNum)+(segundoNum/2);
    double soma = (3*primeiroNum) + terceiroNum;
    double aoCubo = terceiroNum*terceiroNum*terceiroNum;

    System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);
    System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
    System.out.println("O terceiro elevado ao cubo é: " + aoCubo);
    }
}
