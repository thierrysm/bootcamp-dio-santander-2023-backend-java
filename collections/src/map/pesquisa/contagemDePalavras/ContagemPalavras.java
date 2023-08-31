package map.pesquisa.contagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap = new HashMap<>();

    public void adicionarPalavra(String palavra, int contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
        if (!palavrasMap.containsKey(palavra)) {
            System.out.println("Essa palavra não exista no conjunto");
        }
        else System.out.println("O conjunto está vazio");
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        int cont = Integer.MIN_VALUE;
        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> p : palavrasMap.entrySet()) {
                if (p.getValue() > cont) {
                    palavraFrequente = p.getKey();
                    cont = p.getValue();
                }
            }
        }
        else System.out.println("O conjunto está vazio");
        return palavraFrequente;
    }
}
