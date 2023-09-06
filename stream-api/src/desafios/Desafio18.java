package desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio18 {

    /*
    Desafio 18 - Verifique se todos os números da lista são iguais:
    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosIguais = numeros.stream().allMatch(n -> numeros.stream().filter(x -> x.equals(n)).count() != 1);

        if(numerosIguais) {
            System.out.println("Todos os números da lista são iguais");
        } else System.out.println("Todos os numeros da lista não são iguais");

    }
}
