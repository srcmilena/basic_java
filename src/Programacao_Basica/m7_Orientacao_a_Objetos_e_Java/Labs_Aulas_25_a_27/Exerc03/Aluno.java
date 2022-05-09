package programacao_basica.m7_orientacao_a_objetos_e_java.labs_aulas_25_a_27.exerc03;

import java.util.Scanner;

public class Aluno {

    Scanner ler = new Scanner(System.in);

    String nome, curso, disciplina1, disciplina2, disciplina3;
    int matricula, nota1d1, nota2d1, nota1d2, nota2d2, nota1d3, nota2d3;
    //double media1d1, media2d2, media3d3;

    void Verificar() {

        System.out.print("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.print("Digite a sua matrícula: ");
        matricula = ler.nextInt();

        System.out.print("Digite o seu curso: ");
        curso = ler.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1d1 = ler.nextInt();

        System.out.print("Digite a segunda nota: ");
        nota2d1 = ler.nextInt();

        if ((nota1d1+nota2d1) >= 7) {
            System.out.println("Você foi aprovada(o) na disciplina: " + disciplina1);
        } else {
            System.out.println("Você não foi aprovada(o) na disciplina: " + disciplina1);
        }
    }

    void Calcular() {

        System.out.println("\nBoletim: ");

        System.out.println(disciplina2 + ((nota1d2+nota2d2)/2));
        System.out.println(disciplina3 + ((nota1d3+nota1d3)/2));

    }
}
