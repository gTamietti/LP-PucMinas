public class ClienteFisico extends PessoaFisica implements Cliente {
    private double limiteCredito;

    public ClienteFisico(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf, double limiteCredito) {
        super(nome, endereco, telefone, cep, cidade, uf, cpf);
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
