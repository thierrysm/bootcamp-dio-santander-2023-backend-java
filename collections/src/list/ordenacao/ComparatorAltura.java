package list.ordenacao;

import java.util.Comparator;

public class ComparatorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return o1.getAltura().compareTo(o2.getAltura());
    }
}
