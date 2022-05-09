package programacao_basica.m4_controles_decisoes_e_loops.aula_14_if_else;

public class Exerc01_if_quadradinho {
    public static void main(String[] args) {

        boolean temBatata = true;
        int ovos = 6;

        if(temBatata){
            ovos = 9;
        }
        System.out.println("Compre " + ovos + " ovos.");
    }
}
