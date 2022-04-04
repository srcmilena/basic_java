package Programacao_Basica.Orientacao_a_Objetos_e_Java_07.Aula_24.Lista;
/*
* 4. Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente os dados básicos de um livro de uma biblioteca que pode ser emprestado a leitores.
*/
public class Exerc04_LivroDeBiblioteca {
    public static void main(String[] args) {
        Exerc02_Livro livro = new Exerc02_Livro();
        livro.titulo = "A carreira de Marina Sena";
        livro.diaDevolucao = 20;
        livro.mes = "Janeiro";

        System.out.println(livro.titulo);
        System.out.println("Devolução: " + livro.diaDevolucao + " de " + livro.mes);
    }
}
