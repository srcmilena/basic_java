package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_14_If_Else;

import java.util.Scanner;

public class Exerc02_If_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua idade");
        int idade = scan.nextInt();
        if(idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}
