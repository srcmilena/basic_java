package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_42;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();

        Aluno aluno = new Aluno(); // não se tem mais a questão da herança
        Professor professor = new Professor();

        // exemplo 2
        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "iajiosjioj"; não pode modificar por causa do final
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        //total = total = 1;
        System.out.println(TOTAL);
    }
}
