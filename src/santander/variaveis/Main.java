package santander.variaveis;

public class Main {

    public static void main(String[] args) {

        // as variáveis estão sendo criadas dentro de um método e por isso public e static não se aplicamm, apenas final

        int i;
        // int i; não pode com o mesmo nome
        int I;
        // int 1a; não podem começar com número
        int _1a; // não recomendado
        int $aq; // não recomendado

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // constante
        // j = 15; não é possível mudar o valor de j
        int asrn24678md;
        // int asrn246 78md; não é permitido espaço
        int asrn24678_md = 10; // não é recomendado utilizar underline
        // int asrn246%78md = 10; não é possível utilizar símbolos

        asrn24678md = 100;
        asrn24678_md = 10;

        int quantidadeProduto = 50;
        // int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        // final int numeroTentativas = 5; não segue as boas práticas
        int QUANTIDADE_OPCOES = 25;
        // int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn24678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
