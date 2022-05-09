package programacao_basica.m4_controles_decisoes_e_loops.aula_16_while_do_while;

public class Exerc01_loop_while {

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
