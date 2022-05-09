/*
* 8. Faça um programa que pergunte o preço de três produtos e informe qual o produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
*/
package programacao_basica.m4_controles_decisoes_e_loops.aula_15_switch_case.lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do 1o produto");
        double produto1 = scan.nextDouble();
        System.out.println("Digite o valor do 2o produto");
        double produto2 = scan.nextDouble();
        System.out.println("Digite o valor do 3o produto");
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 && produto1 < produto3 && produto1 < 10) {
            System.out.println("Compre o 1o");
        } else if (produto2 < produto1 && produto2 < produto3 && produto2 < 10) {
            System.out.println("Compre o 2o");
        } else if (produto3 < produto2 && produto3 < produto1 && produto3 < 10) {
            System.out.println("Compre o 3o");
        }
    }
}
