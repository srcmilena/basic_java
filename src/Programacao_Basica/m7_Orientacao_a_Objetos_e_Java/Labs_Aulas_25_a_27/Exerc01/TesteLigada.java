package programacao_basica.m7_orientacao_a_objetos_e_java.labs_aulas_25_a_27.exerc01;

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
