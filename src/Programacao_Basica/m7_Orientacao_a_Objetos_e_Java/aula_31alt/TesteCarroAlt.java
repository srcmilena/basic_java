package programacao_basica.m7_orientacao_a_objetos_e_java.aula_31alt;

import programacao_basica.m7_orientacao_a_objetos_e_java.aula_31.Carro;

public class TesteCarroAlt {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat"; // só funciona pois este atributo está público no pacote da aula 31
    }
}
