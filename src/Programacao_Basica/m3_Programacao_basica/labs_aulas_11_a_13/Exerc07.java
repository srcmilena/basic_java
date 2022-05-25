/*
* 7 - Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
*/

package programacao_basica.m3_programacao_basica.labs_aulas_11_a_13;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a altura do quadrado: ");
        double altura = scan.nextDouble();

        /*System.out.print("Digite a largura do quadrado: ");
        double largura = scan.nextDouble();*/ //Não precisa pois são equilateros

        double area = altura*altura;
        double dobroArea = area*2;

        System.out.print("O dobro desta área é: " + dobroArea);
    }
}
