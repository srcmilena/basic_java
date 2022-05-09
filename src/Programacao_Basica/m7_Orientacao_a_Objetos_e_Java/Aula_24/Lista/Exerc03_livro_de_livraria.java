package programacao_basica.Orientacao_a_Objetos_e_Java_07.Aula_24.Lista;

public class Exerc03_livro_de_livraria {
    public static void main(String[] args) {
        Exerc02_Livro gibi = new Exerc02_Livro();
        gibi.titulo = "Monica jovem";
        gibi.autor = "Mauricio de Souza";
        gibi.genero = "Infatil";
        gibi.numPaginas = 50;
        gibi.preco = 20.90;

        System.out.println(gibi.titulo);
        System.out.println(gibi.preco);
    }
}
