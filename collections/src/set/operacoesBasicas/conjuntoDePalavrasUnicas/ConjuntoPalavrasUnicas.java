package set.operacoesBasicas.conjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasUnicas.isEmpty()) {
            palavrasUnicas.remove(palavra);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
