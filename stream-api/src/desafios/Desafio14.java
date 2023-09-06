package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Desafio14 {

    /*
    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumeroPrimo = numeros.stream().filter(n -> n%2 != 0).max(Comparator.naturalOrder()).orElseThrow();

        System.out.println("Maior números primo da lista: " + maiorNumeroPrimo);
    }
}
