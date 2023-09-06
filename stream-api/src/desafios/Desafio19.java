package desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio19 {

    /*
    Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5
    e exiba o resultado no console
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDivisiveis = numeros.stream().filter(n -> n%3 == 0 || n%5 ==0).reduce(0, Integer::sum);

        System.out.println("Soma dos números divisíveis por 3 ou 5: " + somaDosDivisiveis);
    }
}
