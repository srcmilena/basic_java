package programacao_basica.m7_orientacao_a_objetos_e_java.aula_29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    } // Poderia ter sio criado construtores para cada um nessa classe
    // Não é recomendado esse modo "clean" para classes com muitos atributos

    void exibirAutonomia() {
        System.out.println("A autonomia é: " + (capCombustivel*consumoCombustivel));
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel*consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }

}
