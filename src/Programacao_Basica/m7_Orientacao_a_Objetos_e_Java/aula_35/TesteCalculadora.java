package programacao_basica.m7_orientacao_a_objetos_e_java.aula_35;

public class TesteCalculadora {
    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);
    }
}
