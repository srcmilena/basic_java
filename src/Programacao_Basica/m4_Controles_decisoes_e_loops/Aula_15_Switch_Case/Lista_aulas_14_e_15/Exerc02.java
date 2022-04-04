/*
* 2. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*/
package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_15_Switch_Case.Lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if (valor > 0){
            System.out.println("Esse valor é positivo");
        } else {
            System.out.println("Esse valor é negativo");
        }
    }
}
