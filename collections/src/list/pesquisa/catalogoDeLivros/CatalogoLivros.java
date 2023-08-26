package list.pesquisa.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> list = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    list.add(l);
                }
            }
        } else System.out.println("Lista está vazia");
        return list;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> list = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    list.add(l);
                }
            }
        } else System.out.println("Lista está vazia");
        return list;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro  = null;
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
        } else System.out.println("Lista está vazia");
        return livro;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livros=" + livros +
                '}';
    }
}
