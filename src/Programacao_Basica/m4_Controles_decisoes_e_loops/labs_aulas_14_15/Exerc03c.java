/*
* 3 - Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo inválido
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc03c {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite 'F' para feminino ou 'M' para masculino: ");
        String genero = scan.nextLine();

        String feminino = "F";
        String masculino = "M";

        if (genero == feminino) {

            System.out.print("O gênero escolhido é feminino");
        } else if (genero == masculino) {

            System.out.print("O gênero escolhido é masculino");
        } else {

            System.out.print("Gênero inválido");
        }
    }
}
