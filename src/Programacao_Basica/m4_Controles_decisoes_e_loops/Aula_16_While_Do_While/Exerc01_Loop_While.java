package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_16_While_Do_While;

public class Exerc01_Loop_While {

    public static void main(String[] args) {

        // a váriavel "i" é muito utilizada como contador
        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // (incrementação) i = i + 1; ou i += 1;
        }
        System.out.println(i);
    }
}
