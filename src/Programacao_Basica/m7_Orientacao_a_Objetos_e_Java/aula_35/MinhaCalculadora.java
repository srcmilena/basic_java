package programacao_basica.m7_orientacao_a_objetos_e_java.aula_35;

public class MinhaCalculadora { // classe utilitária (quebra um pouco da oo)

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) { // é necessário que haja a troca do TIPO e não NOME do parâmetro
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteiros) { // static auxília no acesso dos métodos
        int total = 0;
        for (int i = 0; i< vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }

    public static class Calculadora {

        public static int somar (int num1, int num2) {
            return num1 + num2;
        }

        public static int subtrair (int num1, int num2) {
            return num1 - num2;
        }

        public static int multiplicar (int num1, int num2) {
            return num1 * num2;
        }

        public static int dividir (int num1, int num2) {
            return num1 / num2;
        }

        public static int potencia (int num1, int num2) {
            int total = 1;
            for (int i=1; i<= num2; i++) {
                total *= num1;
            }
            return total;
        }

        public static int fatorial(int num){
            if (num == 0) {
                return 1;
            }

            int total = 1;
            for (int i=num; i > 1; i--) {
                total *= i;
            }
            return total;
        }
    }
}
