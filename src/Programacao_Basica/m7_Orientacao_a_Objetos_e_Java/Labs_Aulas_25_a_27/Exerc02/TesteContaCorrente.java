package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Labs_Aulas_25_a_27.Exerc02;

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
