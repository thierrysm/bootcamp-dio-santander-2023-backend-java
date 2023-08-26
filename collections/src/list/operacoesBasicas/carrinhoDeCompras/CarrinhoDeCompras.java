package list.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        var item = new Item(nome);
        if (!carrinho.isEmpty()) {
            carrinho.removeIf(i -> i.getNome().equalsIgnoreCase(item.getNome()));
        } else System.out.println("A lista está vazia!");
    }

    public double calcularValorTotal() {
        double total = 0;
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                total += i.getQuantidade() * i.getPreco();
            }
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
