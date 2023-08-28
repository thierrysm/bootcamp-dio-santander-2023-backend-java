package set.pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet = new HashSet<>();

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getStatusTarefa()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else System.out.println("A lista está vazia");
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.getStatusTarefa()) {
                    tarefasPendentes.add(t);
                }
            }
        } else System.out.println("A lista está vazia");
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatusTarefa(true);
                }
            }
        } else System.out.println("A lista está vazia");
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatusTarefa(false);
                }
            }
        } else System.out.println("A lista está vazia");
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }
}
