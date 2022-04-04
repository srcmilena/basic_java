/*
* Escreva uma classe para representar uma lâmpada. Desenvolvs métodos para ligar e desligar a lâmpada
*/

package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Labs_Aulas_25_a_27.Exerc01;

public class Lampada {

    boolean ligada;

    void ligar() {

        ligada = true;
    }

    void desligar() {

        ligada = false;
    }

    void mostrarEstado() {

        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {

        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}

