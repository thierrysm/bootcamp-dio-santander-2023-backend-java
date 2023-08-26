package desafios.contaBanco;

public class ContaTerminal {

    private Integer numeroDaConta;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numeroDaConta, String agencia, String nomeCliente, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + getAgencia() +
                ", conta " + getNumeroDaConta() +
                " e seu saldo e " + getSaldo() +
                " já está disponível para saque\".";
    }
}
