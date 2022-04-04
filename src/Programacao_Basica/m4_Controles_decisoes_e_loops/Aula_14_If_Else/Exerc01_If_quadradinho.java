package Programacao_Basica.m4_Controles_decisoes_e_loops.Aula_14_If_Else;

public class Exerc01_If_quadradinho {
    public static void main(String[] args) {

        boolean temBatata = true;
        int ovos = 6;

        if(temBatata){
            ovos = 9;
        }
        System.out.println("Compre " + ovos + " ovos.");
    }
}
