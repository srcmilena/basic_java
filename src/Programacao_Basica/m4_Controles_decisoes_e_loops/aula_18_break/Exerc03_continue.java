package programacao_basica.m4_controles_decisoes_e_loops.aula_18_break;

import java.util.Scanner;

public class Exerc03_continue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                continue; // imprime o valor de i, mas, se for mutiplo de 7, ele pula e vai para a próxima iteração do for e não executa o que está debaixo do continue
                // mais interessante para for aninhados
                // pode ser usado como o break (goto)
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
