package desafios.controleFluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
