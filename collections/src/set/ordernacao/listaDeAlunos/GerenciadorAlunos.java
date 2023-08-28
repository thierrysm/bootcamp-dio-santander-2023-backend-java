package set.ordernacao.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet = new HashSet<>();

    public Set<Aluno> getAlunosSet() {
        return alunosSet;
    }

    public void setAlunosSet(Set<Aluno> alunosSet) {
        this.alunosSet = alunosSet;
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosNome = new TreeSet<>(alunosSet);
        if (alunosSet.isEmpty()) System.out.println("O conjunto está vazio");
        return alunosNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosNota.addAll(alunosSet);
        } else System.out.println("O conjunto está vazio");
        return alunosNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }
}
