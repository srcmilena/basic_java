package programacao_basica.m7_orientacao_a_objetos_e_java.aula_35;

public class Calculadora {

    public static int fatorialNaoRecursivo(int num){
        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i=num; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    //fatorial(5) = 5*fatorial(4)...
    public static int fatorial(int num) { // recursivo

        if (num == 0) {
            return 1; // ponto de parada
        }
        return num*fatorial(num-1);
    }
}
