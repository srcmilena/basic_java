package programacao_basica.m7_orientacao_a_objetos_e_java.aula_26;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + (capCombustivel*consumoCombustivel));
    }

    public double obterAutonomia() { // "double" pois é o tipo de informação que esse método vai retornar (sempre com return no FINAL, pós lógica de programação)
        System.out.println("Método obterAutonomia foi chamado");

        return (capCombustivel*consumoCombustivel);

    }
}
