package Programacao_Basica.m3_Programacao_basica.Aula_11;

public class Aula_11_Curiosidade_Int_extra {

    public static void main(String[] args) {
        int var1 = 2147483647; // Limite máximo em kbts. Se fazer a soma, o retorno será negativo no output, mas, não
        // dará erro
        int var2 = 100;

        System.out.println(var1 + var2); // Os números no Java funcionam como uma roleta. Do momento que eu pego o
        // limite e somo algo, ele volta para o número negativo (serve para todos os tipos)
    }
}
