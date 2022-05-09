package programacao_basica.m7_orientacao_a_objetos_e_java.aula_30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca; // Com o this.marca fica explícito que ele é o atributo da classe e marca é o parâmetro
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() { }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;

        System.out.println("Chamando contrutor com 3 parâmetros");

    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);

        System.out.println("Chamando construtor com 2 parâmetros");

    }

    void exibirAutonomia() {
        System.out.println("A autonomia é: " + (this.capCombustivel*this.consumoCombustivel) + "km"); //Neste caso, não tem problema em deixar sem o this, mas, pode ser usado caso queiramos deixar explicíto
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return (this.capCombustivel*this.consumoCombustivel);
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = (km/this.consumoCombustivel);
        return qtdCombustivel;
    }

}