/*
* Escreva uma classe para representar uma lâmpada. Desenvolvs métodos para ligar e desligar a lâmpada
*/

package programacao_basica.m7_orientacao_a_objetos_e_java.labs_aulas_25_a_27.exerc01;

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

