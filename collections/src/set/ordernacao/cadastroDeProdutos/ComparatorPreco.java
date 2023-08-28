package set.ordernacao.cadastroDeProdutos;

import java.util.Comparator;

public class ComparatorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }
}
