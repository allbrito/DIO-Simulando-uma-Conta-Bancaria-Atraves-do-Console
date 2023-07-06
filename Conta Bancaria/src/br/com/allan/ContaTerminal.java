package br.com.allan;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o numero da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o numero da agencia:");
        String agencia = sc.next();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}