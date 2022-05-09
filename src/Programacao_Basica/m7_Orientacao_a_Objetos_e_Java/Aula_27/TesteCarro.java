package programacao_basica.m7_orientacao_a_objetos_e_java.aula_27;

public class TesteCarro {

    public static void main(String[] args) { // o método public static é para executar um bloco de código e o void quer dizer que não retorna nenhum valor e main é o nome do método e String[] quer dizer que está executando uma array de strings e args é o nome dado ao parâmetro array de strings (não tem problema em alterar)

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.print(van.marca);
        System.out.print(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double qtdCombustivel10 = van.calcularCombustivel(10); // "10" é um parâmetro via argumento (esse valor pode ser chamado de parâmetro ou argumento)
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

    }
}

