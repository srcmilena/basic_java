package programacao_basica.m7_orientacao_a_objetos_e_java.aula_31;

public class Carro { // public faz com que a classe seja visível em todos os pacotes do projeto
//class Carro { // sem o public, faz com que seja visível apenas dentro dopacote da aula 31 (classe default)

    // os seguintes atributos também só estão visíveis dentro desse pacote pois são default, ou seja, atributos padrões
    public String marca; // public faz com que esse atributo seja visível em todos os pacotes do projeto
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel; // não vamos privar todos os atributos para essa classe e sim liberar o acesso para as outras classes que queiram utilizar (dentro do projeto)

    public void exibirAutonomia() { // geralmente vamos expôr os métodos para as outras classes, deixando como público
        System.out.println("A autonomia é: " + (this.capCombustivel*this.consumoCombustivel) + "km");
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return (this.capCombustivel*this.consumoCombustivel);
    }

    private double divideKMPorConsumoCombustivel(double km) { // método visível apenas dentro da classe servindo para organizar o código
        return km/this.consumoCombustivel; // this = referência
    }

    public double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }

}
