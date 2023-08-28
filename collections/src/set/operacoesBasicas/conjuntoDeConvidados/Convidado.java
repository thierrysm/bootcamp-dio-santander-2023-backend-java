package set.operacoesBasicas.conjuntoDeConvidados;

public class Convidado {

    private String nome;
    private Integer codigoDoConvite;

    public Convidado(String nome, Integer codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoConvite() {
        return codigoDoConvite;
    }

    public void setCodigoDoConvite(Integer codigoDoConvite) {
        this.codigoDoConvite = codigoDoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoDoConvite=" + codigoDoConvite +
                '}';
    }
}
