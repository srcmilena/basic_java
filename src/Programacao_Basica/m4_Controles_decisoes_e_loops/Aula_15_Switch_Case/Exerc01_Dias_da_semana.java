package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_15_Switch_Case;

import java.util.Scanner;

public class Exerc01_Dias_da_semana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia da semana válido");
        }
    }
}
