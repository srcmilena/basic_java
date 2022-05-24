package programacao_basica.m7_orientacao_a_objetos_e_java.aula_24.lista;

public class Exerc03_livro_de_livraria {
    public static void main(String[] args) {
        Exerc02_livro gibi = new Exerc02_livro();
        gibi.titulo = "Monica jovem";
        gibi.autor = "Mauricio de Souza";
        gibi.genero = "Infatil";
        gibi.numPaginas = 50;
        gibi.preco = 20.90;

        System.out.println(gibi.titulo);
        System.out.println(gibi.preco);
    }
}
