package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_40;

public class Teste {

    public static void main(String[] args) {

        // ato de instanciar
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
