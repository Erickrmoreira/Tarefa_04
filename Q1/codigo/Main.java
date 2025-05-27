package Q1.codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FuncionarioTI> funcionarios = new ArrayList<>();

        System.out.println("=== Cadastro de Funcionários TI ===");
        while (true) {
            System.out.print(
                "\nOpções:\n" +
                "[1] Cadastrar Desenvolvedor\n" +
                "[2] Cadastrar Administrador de Rede\n" +
                "[3] Exibir funcionários cadastrados\n" +
                "[0] Sair\n" +
                "Escolha: "
            );

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Linguagem Principal: ");
                    String linguagem = sc.nextLine();
                    System.out.print("Nível (Júnior, Pleno, Sênior): ");
                    String nivel = sc.nextLine();

                    funcionarios.add(new Desenvolvedor(nome, matricula, linguagem, nivel));
                    System.out.println("Desenvolvedor cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Certificação: ");
                    String certificacao = sc.nextLine();
                    System.out.print("Sistema Operacional Responsável: ");
                    String sistema = sc.nextLine();

                    funcionarios.add(new AdministradorRede(nome, matricula, certificacao, sistema));
                    System.out.println("Administrador de Rede cadastrado com sucesso!");
                }
                case 3 -> {
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                    } else {
                        System.out.println("\n=== Funcionários Cadastrados ===");
                        for (FuncionarioTI f : funcionarios) {
                            f.exibirDados();
                            f.executarOperacoes();
                            System.out.println();
                        }
                    }
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
