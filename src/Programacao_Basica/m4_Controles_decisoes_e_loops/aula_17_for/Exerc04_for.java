package programacao_basica.m4_controles_decisoes_e_loops.aula_17_for;

public class Exerc04_for {

    public static void main(String[] args) {

        // loop sem corpo
        int soma = 0;
        for (int i = 1; i < 5; soma += i ++);
        System.out.println("O valor da soma é: " + soma);

        /*
        sem as chaves: (mais utilizado em switch, porém, não recomendado por conta de atrapalhar e dificultar o código)
        * for (int = 0; i < 5; i++)
        * System.out.print(i);
        * */
    }
}
