package programacao_basica.m4_controles_decisoes_e_loops.aula_14_if_else;

import java.util.Scanner;

public class Exerc02_if_else {
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
