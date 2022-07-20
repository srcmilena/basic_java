package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_45;

public class Test2 {

    public static void main(String[] args) {
        Object obj1 = obterString(); // downcasting
        String s1 = (String) obj1;

        Object obj2 = "Minha String"; // downcasting
        String s2 = (String) obj2;

        Object obj3 = new Object();
        String s3 = (String) obj3;

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInteiro() {
        return 1;
    }
}
