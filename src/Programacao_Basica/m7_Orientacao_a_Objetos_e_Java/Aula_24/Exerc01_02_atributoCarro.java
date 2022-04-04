package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Aula_24;

public class Exerc01_02_atributoCarro {
    public static void main(String[] args) {
        // Criação de objetos; Instanciando atributos; O modelo do código abaixo não é o ideal, é feio; Setar valores para os atributos dos objetos = nome da variável ponto (.) o nome do atributo (é o mesmo que atribuir valores à variáveis
        Exerc01_01_Carro van = new Exerc01_01_Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Exerc01_01_Carro fusca = new Exerc01_01_Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
