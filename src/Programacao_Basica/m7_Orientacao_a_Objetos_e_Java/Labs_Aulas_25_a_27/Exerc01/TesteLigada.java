package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Labs_Aulas_25_a_27.Exerc01;

public class TesteLigada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada(); // Instanciando o objeto

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();

    }
}
