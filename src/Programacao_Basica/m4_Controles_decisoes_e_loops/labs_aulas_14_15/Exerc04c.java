/*
* 4 -  Faça um programa que verifique se uma letra digitada é vogal ou consoante
*/

package programacao_basica.m4_controles_decisoes_e_loops.labs_aulas_14_15;

import java.util.Scanner;

public class Exerc04c {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma letra");
        String vogais = scan.nextLine();

        if (vogais == "a") {

            System.out.print("Essa letra é uma vogal");
        } else {

            System.out.print("Essa letra é uma consoante");
        }
    }
}
