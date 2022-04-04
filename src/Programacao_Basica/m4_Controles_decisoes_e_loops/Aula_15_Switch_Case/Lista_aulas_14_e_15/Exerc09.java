/*
* 9. Faça um programa que leia três números e mostre-os em ordem decrescente.
*/
package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_15_Switch_Case.Lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do 1o");
        int n1 = scan.nextInt();
        System.out.println("Digite o valor do 2o");
        int n2 = scan.nextInt();
        System.out.println("Digite o valor do 3o");
        int n3 = scan.nextInt();

        if (n1 < n2 && n1 < n3){
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3){
            System.out.println(n2);
        } else if (n3 < n1 && n3 < n2){
            System.out.println(n3);
        }
    }
}
