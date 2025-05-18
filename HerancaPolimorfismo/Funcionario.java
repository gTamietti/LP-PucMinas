public class Funcionario extends PessoaFisica {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf, String cargo, double salario) {
        super(nome, endereco, telefone, cep, cidade, uf, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cargo: " + cargo + " | Salário: R$" + salario);
    }
}
