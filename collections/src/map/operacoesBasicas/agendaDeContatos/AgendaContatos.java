package map.operacoesBasicas.agendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) contatosMap.remove(nome);
        else System.out.println("A agenda de contatos está vazia.");
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public int pesquisarPorNome(String nome) {
        int numero = 0;
        if (!contatosMap.isEmpty()) {
            for (Map.Entry<String, Integer> c : contatosMap.entrySet()) {
                if (c.getKey().equalsIgnoreCase(nome)) numero = c.getValue();
            }
        } else System.out.println("A agenda de contatos está vazia.");
        return numero;
    }
}
