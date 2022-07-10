package programacao_basica.m7_orientacao_a_objetos_e_java.aula_32;

public class TesteCarro {

    // encapsulamento (getters e setters) = não expor, diretamente, os atributos (settar os atributos como privates e criar os getters e setters)
    public static void main(String[] args) {

        Carro van = new Carro();
        van.setMarca("Fiat");

        System.out.println(van.getMarca());
    }
}
