package programacao_basica.m7_orientacao_a_objetos_e_java.aula_24.lista;
/*
* 4. Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente os dados básicos de um livro de uma biblioteca que pode ser emprestado a leitores.
*/
public class Exerc04_livro_de_biblioteca {
    public static void main(String[] args) {
        Exerc02_livro livro = new Exerc02_livro();
        livro.titulo = "A carreira de Marina Sena";
        livro.diaDevolucao = 20;
        livro.mes = "Janeiro";

        System.out.println(livro.titulo);
        System.out.println("Devolução: " + livro.diaDevolucao + " de " + livro.mes);
    }
}
