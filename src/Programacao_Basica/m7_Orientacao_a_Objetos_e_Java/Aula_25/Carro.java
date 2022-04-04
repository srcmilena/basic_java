package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Aula_25;

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
