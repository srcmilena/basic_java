package programacao_basica.m7_orientacao_a_objetos_e_java.aula_27;

// Declarando a classe
public class Carro {

    // Declaração dos atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Métodos
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + (capCombustivel*consumoCombustivel));
    }

    double obterAutonomia() { // "double" pois é o tipo de informação que esse método vai retornar (sempre com return no FINAL, pós lógica de programação)
        System.out.println("Método obterAutonomia foi chamado");

        return (capCombustivel*consumoCombustivel);

    }

    double calcularCombustivel(double km) { // "double km" é uma informação declarada como parâmetro

        double qtdCombustivel = (km/consumoCombustivel); //consumoCombustivel já temos, então não precisa passar com oparâmetro pois já é atributo da classe

        return qtdCombustivel;
    }
}

// Os métodos podem ser primeiros e depois os atributos, mas, com oboa prática, essa é a ordem