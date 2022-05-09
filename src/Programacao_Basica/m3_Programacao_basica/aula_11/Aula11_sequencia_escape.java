package programacao_basica.m3_programacao_basica.aula_11;

public class Aula11_sequencia_escape {

    public static void main(String[] args) {
        // "Hello, world!"

        System.out.print("\"Hello, world\"\n\r"); // "\n\r" = println (modo para pular linha)
        // Modo para imprimir algo com as aspas

        // 1\4 = se quiser imprimir algo com barra, tem que usar as duas barras (sequência escape)
        System.out.print("1\\4");
    }
}
