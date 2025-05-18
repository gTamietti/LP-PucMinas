public class ClienteJuridico extends PessoaJuridica implements Cliente {
    private double limiteCredito;

    public ClienteJuridico(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cnpj, double limiteCredito) {
        super(nome, endereco, telefone, cep, cidade, uf, cnpj);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite de crédito: " + limiteCredito);
    }
}
