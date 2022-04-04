package Programacao_Basica.m3_Programacao_basica;

public class Aula_10_Introducao_a_variaveis {

    public static void main(String[] args) {

        // Segue a conveção Java
        int idade = 20;
        String nome = "Milena";
        String nomeDoMeuCachorro = "Jully";
        String ano2014 = "2014";

        // Aceito, mas não utilizado
        int _idade;
        int $idade;

        // Não é conveção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 22;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // Má prática
        // 1 - Dar nomes para as variáveis que signifiquem algo
        int a = 10;
        String b = "Loiane";
    }
}
