package set.pesquisa.listaDeTarefas;

public class Tarefa {

    private String descricao;
    private Boolean statusTarefa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.statusTarefa = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(Boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaConcluida=" + statusTarefa +
                '}';
    }
}
