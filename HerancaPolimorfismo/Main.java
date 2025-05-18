import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU DA EMPRESA ===");
            System.out.println("1. Adicionar Cliente Pessoa Física");
            System.out.println("2. Adicionar Cliente Pessoa Jurídica");
            System.out.println("3. Adicionar Funcionário");
            System.out.println("4. Definir Presidente");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Funcionários");
            System.out.println("7. Mostrar Presidente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:  {
                    System.out.println("\n--- Adicionar Cliente PF ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("UF: ");
                    String uf = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Limite de crédito: ");
                    double limite = scanner.nextDouble();
                    scanner.nextLine();

                    ClienteFisico cliente = new ClienteFisico(nome, endereco, telefone, cep, cidade, uf, cpf, limite);
                    empresa.adicionarCliente(cliente);
                    System.out.println("Cliente PF adicionado com sucesso!");
                }

                case 2:  {
                    System.out.println("\n--- Adicionar Cliente PJ ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("UF: ");
                    String uf = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    System.out.print("Limite de crédito: ");
                    double limite = scanner.nextDouble();
                    scanner.nextLine();

                    ClienteJuridico cliente = new ClienteJuridico(nome, endereco, telefone, cep, cidade, uf, cnpj, limite);
                    empresa.adicionarCliente(cliente);
                    System.out.println("Cliente PJ adicionado com sucesso!");
                }

                case 3:  {
                    System.out.println("\n--- Adicionar Funcionário ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("UF: ");
                    String uf = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    Funcionario funcionario = new Funcionario(nome, endereco, telefone, cep, cidade, uf, cpf, cargo, salario);
                    empresa.adicionarFuncionario(funcionario);
                    System.out.println("Funcionário adicionado com sucesso!");
                }

                case 4:  {
                    System.out.println("\n--- Definir Presidente ---");
                    if (empresa.getFuncionarios().isEmpty()) {
                        System.out.println("Não há funcionários cadastrados.");
                    } else {
                        empresa.listarFuncionarios();
                        System.out.print("Informe o número do funcionário para ser o presidente (0 a " + (empresa.getFuncionarios().size() - 1) + "): ");
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if (index >= 0 && index < empresa.getFuncionarios().size()) {
                            empresa.definirPresidente(empresa.getFuncionarios().get(index));
                            System.out.println("Presidente definido com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                }

                case 5:  empresa.listarClientes();
                case 6:  empresa.listarFuncionarios();
                case 7:  empresa.mostrarPresidente();
                case 0:  System.out.println("Encerrando o programa...");
                default:  System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
