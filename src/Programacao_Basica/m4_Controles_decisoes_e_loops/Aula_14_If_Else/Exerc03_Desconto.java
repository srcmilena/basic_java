package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_14_If_Else;

import java.util.Scanner;

public class Exerc03_Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scan.nextDouble();
        if (valorProduto <= 10) {
            System.out.println("O produto está barato");
        } else if (valorProduto > 10 && valorProduto < 15) {
            System.out.println("Peça desconto");
        } else if (valorProduto >= 15 && valorProduto < 17) {
            System.out.println("Pode pesquisar mais");
        }
        else { //valor >= 17
            System.out.println("Está caro");
        }
    }
}
