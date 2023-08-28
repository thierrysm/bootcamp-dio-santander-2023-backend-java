package set.ordernacao.cadastroDeProdutos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet = new HashSet<>();

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtosSet);
        if (produtosNome.isEmpty()) System.out.println("O conjunto está vazio!");
        return produtosNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPreco());
        if (!produtosSet.isEmpty()) {
            produtosPreco.addAll(produtosSet);
        } else System.out.println("O conjunto está vazio!");
        return produtosPreco;
    }
}
