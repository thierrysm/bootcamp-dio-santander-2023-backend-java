package list.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int sum = 0;
        if (!numeros.isEmpty()) {
            for (int num : numeros) {
                sum += num;
            }
        } else System.out.println("A lista está vazia");
        return sum;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (int num : numeros) {
                if (num >= maior) {
                    maior = num;
                }
            }
        } else System.out.println("A lista está vazia");
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (int num : numeros) {
                if (num <= menor) {
                    menor = num;
                }
            }
        } else System.out.println("A lista está vazia");
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}
