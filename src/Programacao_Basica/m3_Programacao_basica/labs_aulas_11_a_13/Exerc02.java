/*
* 2 - Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]"
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("O número digitado foi: " + numero);
    }
}
