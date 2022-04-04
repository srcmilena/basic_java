/*
* Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque esceial ou não. Desenvolva um programa para testar essa classe.
*/

package Programacao_Basica.m7_Orientacao_a_Objetos_e_Java.Labs_Aulas_25_a_27.Exerc02;

public class ContaCorrente {

    int numeroConta;
    double saldo, limite, deposito;
    boolean contaEspecial, chequeEspecial;

    void Sacar() {

        if (saldo >= 10) {
            System.out.println("\nSaque realizado");
        } else {
            System.out.println("\nNão é possível realizar saque");
        }

    }

    void Depositar() {

        if (deposito >= 10) {
            System.out.println("\nDepósito no valor de: R$" + deposito + " realizado");
            System.out.println("Seu saldo agora é de: R$" + (saldo+deposito));

        }
    }

    void Consultar() {

        System.out.println("\nO número da sua conta é: " + numeroConta);
        System.out.println("\nSeu saldo é de: R$" + saldo);
        System.out.println("Seu limite é de: R$" + limite);

    }

    void Verificar() {

        if (contaEspecial) {
            System.out.println("\nA sua conta é especial");
        } else {
            System.out.println("\nA sua conta é comum");
        }

        if (chequeEspecial) {
            System.out.println("\nVocê está utilizando o cheque especial");
        } else {
            System.out.println("\nVocê não está utilizando o cheque especial");
        }

    }

}
