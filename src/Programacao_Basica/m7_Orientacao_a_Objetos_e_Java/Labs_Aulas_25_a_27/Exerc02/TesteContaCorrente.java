package programacao_basica.m7_orientacao_a_objetos_e_java.labs_aulas_25_a_27.exerc02;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente usuario = new ContaCorrente();

        usuario.numeroConta = 12345;
        usuario.saldo = 125.25;
        usuario.contaEspecial = false;
        usuario.limite = 2000.00;
        usuario.deposito = 100.28;
        usuario.chequeEspecial = true;

        usuario.Consultar();
        usuario.Verificar();
        usuario.Sacar();
        usuario.Depositar();
    }
}
