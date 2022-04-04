/*
* 5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por um aluno e apresentar:
* - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
* - A mensagem "Reprovado", se a média for menor do que sete;
* - A mensagem "Aprovado com distinção", se a média for igual a dez.
*/
package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_15_Switch_Case.Lista_aulas_14_e_15;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media <= 9) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else {
            System.out.println("Preencha novamente");
        }
    }
}
