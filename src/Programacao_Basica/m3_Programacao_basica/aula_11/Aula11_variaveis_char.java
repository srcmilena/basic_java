package programacao_basica.m3_programacao_basica.aula_11;

public class Aula11_variaveis_char {

    public static void main(String [] args) {
        // char o = 'o'; // 111
        // char i = 'i'; // 105

        // System.out.print(o + i); //Se deixar assim, a impressão vai sair como soma dos valores da tabela ASCII

        char o = 111;
        char i = 105;
        char interrogacao = 63; //Valor do ponto de interrogação na tabela

        System.out.print("" + o + i + interrogacao); // Já nesse, o uso das aspas converter os tipos
    }
}
