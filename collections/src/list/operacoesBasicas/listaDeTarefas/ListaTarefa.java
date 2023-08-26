package list.operacoesBasicas.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaTarefa {

    private List<Tarefa> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        var tarefa = new Tarefa(descricao);
        if (!listaDeTarefas.isEmpty()) {
            listaDeTarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(tarefa.getDescricao()));
        } else System.out.println("A lista está vazia!");
    }

    public int obterNumeroTotalTarefas() {
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas() {
        if (!listaDeTarefas.isEmpty()) {
            System.out.println(listaDeTarefas);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
