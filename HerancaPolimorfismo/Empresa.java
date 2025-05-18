// Empresa.java
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private Funcionario presidente;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void definirPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public void listarClientes() {
        System.out.println("Clientes da empresa:");
        for (Cliente cliente : clientes) {
            if (cliente instanceof Pessoa)
                ((Pessoa) cliente).mostrarDados();
        }
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa:");
        for (Funcionario f : funcionarios) {
            f.mostrarDados();
        }
    }

    public void mostrarPresidente() {
        if (presidente != null) {
            System.out.println("Presidente da empresa:");
            presidente.mostrarDados();
        } else {
            System.out.println("Presidente não definido.");
        }
    }

    public List<Funcionario> getFuncionarios() {
    return funcionarios;
}

}
