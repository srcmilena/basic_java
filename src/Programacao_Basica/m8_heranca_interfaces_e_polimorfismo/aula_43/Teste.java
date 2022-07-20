package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);
        // o número que sair impresso no terminal, é o número em que está sendo executado na memória do computador (ponteiros)

        String s1 = "ahsuha";
        String s2 = "ahsuha";

        //System.out.println(s1 == s2);

        //  "==" compara as referências (valor na memória de valores primitivos), e não os valores (em objetos)
        // "equals" para comparação entre objetos

        System.out.println(s1.equals(s2));
        //System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciência da computação");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);

        //System.out.println(aluno == aluno2);
        System.out.println(aluno.equals(aluno2)); // equals = comparação de igualdade com objetos
    }
}
