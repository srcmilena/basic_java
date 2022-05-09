package programacao_basica.m7_orientacao_a_objetos_e_java.aula_25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() { // "void" pois não vai retornar nada, apenas exibir
        System.out.print("A autonomia do carro é: " + (capCombustivel*consumoCombustivel) + "km");
    }
}
