/*
* 5 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por um aluno e apresentar:
- A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
- A mensagem "Reprovado", se a média alcançada for menor do que sete;
- A mensagem "Aprovado com distinção", se a média foi igual a dez.
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;

        if (media >= 7 & media < 10) {

            System.out.print("Aprovada(o)");
        } else if (media == 10) {

            System.out.print("Aprovada(o) com destinção");
        } else {

            System.out.print("Reprovada(o)");
        }
    }


}
