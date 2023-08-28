package set.operacoesBasicas.conjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (!convidadoSet.isEmpty()) {
            convidadoSet.removeIf(c -> c.getCodigoDoConvite() == codigoConvite);
        } else System.out.println("A lista está vazia");
    }

    public int contarConvidados() {
       return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
