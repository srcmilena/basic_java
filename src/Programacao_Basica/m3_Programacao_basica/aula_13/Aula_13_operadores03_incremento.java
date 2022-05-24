package programacao_basica.m3_programacao_basica.aula_13;

public class Aula_13_operadores03_incremento {

    public static void main(String[] args) {

        int resultado = 1 + 2;

        resultado = +1;
        System.out.println(resultado);

        resultado--; // Primeiro imprime e depois retira
        System.out.println(resultado);

        --resultado; // Primeiro retira e depois imprime
        System.out.println(resultado);

        resultado++; // Primeiro imprime e depois soma
        System.out.println(resultado);

        ++resultado; // Primeiro soma e depois imprime
        System.out.println(resultado);

        resultado = -resultado;
        System.out.println(resultado);

        boolean success = false;

        System.out.println(success);
        System.out.println(!success);
    }
}
