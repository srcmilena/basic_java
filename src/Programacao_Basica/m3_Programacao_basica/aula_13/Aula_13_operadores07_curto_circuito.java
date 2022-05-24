package programacao_basica.m3_programacao_basica.aula_13;

public class Aula_13_operadores07_curto_circuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro; // com um único "&", verifica a 1a condição, vai na 2a e volta para atribuir o valor
        boolean resultado2 = falso &&
                verdadeiro; // aqui acontece o curto-circuito (o mesmo serve para o "ou"), onde verifica a 1a condição falsa e já pula a 2a
        System.out.println(resultado1);
        System.out.println(resultado2);

        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }
}
