package map.pesquisa.estoquesDeProduto;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtosMap = new HashMap<>();

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> c : produtosMap.entrySet()) {
                total += c.getValue().getPreco() * c.getValue().getQuantidade();
            }
        } else System.out.println("O conjunto está vazio");
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoCaro = null;
        double maior = Double.MIN_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() >= maior) {
                    produtoCaro = p;
                    maior = p.getPreco();
                }
            }
        } else System.out.println("O conjunto está vazio");
        return produtoCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoBarato = null;
        double menor = Double.MAX_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() < menor) {
                    produtoBarato = p;
                    menor = p.getPreco();
                }
            }
        } else System.out.println("O conjunto está vazio");
        return produtoBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorTotal = null;
        double maior = Double.MIN_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() * p.getQuantidade() > maior) {
                    produtoMaiorValorTotal = p;
                    maior = p.getPreco() * p.getQuantidade();
                }
            }
        } else System.out.println("O conjunto está vazio");
        return  produtoMaiorValorTotal;
    }
}
