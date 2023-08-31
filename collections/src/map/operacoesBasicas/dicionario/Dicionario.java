package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty())  palavrasMap.remove(palavra);
        else System.out.println("O conjunto está vazio");
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String def = null;
        if (!palavrasMap.isEmpty()) {
            if (palavrasMap.containsKey(palavra)) def = palavrasMap.get(palavra);
        }
        if (def == null) {
            System.out.println("A palavra não contem no conjunto");
        }
        else System.out.println("O conjunto está vazio");
        return def;
    }
}
