package desafios.contaBanco;

import desafios.contaBanco.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número Conta !");
        int conta = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do Titular");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = sc.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(conta, agencia, nome, saldo);

        System.out.println(contaTerminal);
    }
}