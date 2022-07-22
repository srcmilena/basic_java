package programacao_basica.m7_orientacao_a_objetos_e_java.aula_34;

public class TesteCalculadora {

    static int resultSoma = MinhaCalculadora.soma(1, 2);

    public static void main(String[] args) {

        /*MinhaCalculadora calc = new MinhaCalculadora();
        int soma1 = calc.soma(1, 2);
        System.out.println(soma1);

        int soma2 = calc.soma(1, 2, 3);
        System.out.println(soma2);*/

        //MinhaCalculadora.soma(1, 2); // simplifica em questões de código mais simplificado

        soma2Valores(1, 2);
    }
    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }
}
