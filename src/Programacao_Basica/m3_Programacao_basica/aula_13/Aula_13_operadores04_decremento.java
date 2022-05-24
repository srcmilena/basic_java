package programacao_basica.m3_programacao_basica.aula_13;

public class Aula_13_operadores04_decremento {

    public static void main(String[] args) {

        int i = 3;

        i++;
        /* igual a:
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;
        */
        // output 4
        System.out.println(i);

        ++i;
        /*
        igual a:
        resultado += 1;
        System.out.println(resultado)
        */
        // output 5
        System.out.println(i);

        /*
        * a maior diferença entre i++ e ++i é sobre em qual momento vamos adicionar "1", se antes ou depois da ação que queremos fazer. Nos casos acima, é para ser acrescido 1 antes ou depois de imprimir. A mesma coisa para i-- e --i
        */

        // output 6
        System.out.println(++i);

        // output 6
        System.out.println(i++);

        // output 7
        System.out.println(i);
    }
}
