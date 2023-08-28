package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoasList = new ArrayList<>();

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public List<Pessoa> getPessoasList() {
        return pessoasList;
    }

    public void setPessoasList(List<Pessoa> pessoasList) {
        this.pessoasList = pessoasList;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        pessoasPorAltura.sort(new ComparatorAltura());
        return pessoasPorAltura;
    }
}
