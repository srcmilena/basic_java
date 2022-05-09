package programacao_basica.m7_orientacao_a_objetos_e_java.aula_25;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.print(van.marca);
        System.out.print(van.modelo);

        van.exibirAutonomia(); // Variável van que chama um método
    }
}
