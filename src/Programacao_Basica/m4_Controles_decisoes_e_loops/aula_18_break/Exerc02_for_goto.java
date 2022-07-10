package programacao_basica.m4_controles_decisoes_e_loops.aula_18_break;

public class Exerc02_for_goto {

    // com rótulos
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            rotulo1: { // identificando esse bloco de código como bloco 1
                rotulo2: {
                    rotulo3: {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
    }
}
