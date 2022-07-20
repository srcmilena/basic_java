package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_45;

public class Teste {

    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting = transformar uma classe menor em uma classe de nível maior

        Pessoa aluno2 = (Pessoa) new Aluno(); //downcasting
        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("é do tipo Pessoa");
        }
        if (aluno instanceof Aluno) {
            System.out.println("é do tipo Pessoa");
        }
        if (prof instanceof Professor) {
            System.out.println("é do tipo Pessoa");
        }
    }
}
