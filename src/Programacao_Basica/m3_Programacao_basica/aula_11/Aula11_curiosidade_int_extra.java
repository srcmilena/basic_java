package programacao_basica.m3_programacao_basica.aula_11;

public class Aula11_curiosidade_int_extra {

    public static void main(String[] args) {
        int var1 = 2147483647; // Limite máximo em kbts. Se fazer a soma, o retorno será negativo no output, mas, não
        // dará erro
        int var2 = 100;

        System.out.println(var1 + var2); // Os números no Java funcionam como uma roleta. Do momento que eu pego o
        // limite e somo algo, ele volta para o número negativo (serve para todos os tipos)
    }
}
