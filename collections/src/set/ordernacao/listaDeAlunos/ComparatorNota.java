package set.ordernacao.listaDeAlunos;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNota().compareTo(o2.getNota());
    }
}
