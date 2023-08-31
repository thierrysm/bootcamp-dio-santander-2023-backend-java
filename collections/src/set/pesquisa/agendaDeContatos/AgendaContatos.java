package set.pesquisa.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatoNome.add(c);
                }
            }
        }
        return contatoNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        Contato contato = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                }
            }
        } else System.out.println("O conjunto está vazio");
    }
}
