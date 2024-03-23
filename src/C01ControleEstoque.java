import java.util.Scanner;

import br.com.brazcubas.controleestoque.modelo.Produto;

/**
 * C01ControleEstoque
 * 
 * Você foi contratado para desenvolver um sistema de controle de estoque para
 * uma loja de materiais de construção. O sistema deve permitir que o usuário
 * cadastre novos produtos, consulte o estoque atual, registre vendas e atualize
 * o estoque após cada venda. Para isso, você precisa aplicar os conceitos de
 * métodos, arrays, entrada e saída de dados, e controle de fluxo.
 * 
 * O sistema deve ter um menu com as seguintes opções:
 * 1: Cadastrar Novo Produto
 * 2: Consultar Estoque
 * 3: Registrar Venda
 * 4: Sair
 * O cadastro de um novo produto deve solicitar ao usuário o nome, o preço e a
 * quantidade em estoque. Os dados do produto devem ser armazenados em arrays
 * separados para cada atributo. A consulta de estoque deve exibir todos os
 * produtos cadastrados, juntamente com suas quantidades em estoque. O registro
 * de uma venda deve solicitar ao usuário o nome do produto e a quantidade
 * vendida. O sistema deve atualizar a quantidade em estoque do produto após a
 * venda. O sistema deve continuar em execução até que o usuário escolha a opção
 * "Sair"
 */
public class C01ControleEstoque {
	// Array para armazenar os dados dos produtos
	private static Produto[] produtos = new Produto[100];
	private static int totalProdutos = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao;
		do {
			exibirMenu();
			System.out.print("Selecione uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do teclado

			switch (opcao) {
				case 1:
					cadastrarProduto(scanner);
					break;
				case 2:
					consultarEstoque();
					break;
				case 3:
					registrarVenda(scanner);
					break;
				case 4:
					System.out.println("Obrigado por utilizar nosso sistema. Até mais!");
					break;
				default:
					System.out.println("Opção inválida. Por favor, tente novamente.");
			}
		} while (opcao != 4);

		scanner.close();
	}

	private static void exibirMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Cadastrar Novo Produto");
		System.out.println("2. Consultar Estoque");
		System.out.println("3. Registrar Venda");
		System.out.println("4. Sair");
	}

	private static void cadastrarProduto(Scanner scanner) {
		System.out.println("\n--- Cadastro de Novo Produto ---");
		System.out.print("Nome do Produto: ");
		String nome = scanner.nextLine();
		System.out.print("Preço: R$ ");
		double preco = scanner.nextDouble();
		System.out.print("Quantidade em Estoque: ");
		int quantidade = scanner.nextInt();

		Produto produto = new Produto(nome, preco, quantidade);
		produtos[totalProdutos] = produto;
		totalProdutos++;

		System.out.println("Produto cadastrado com sucesso!");
	}

	private static void consultarEstoque() {
		System.out.println("\n--- Consulta de Estoque ---");
		for (int i = 0; i < totalProdutos; i++) {
			System.out.println(produtos[i].getDetalhesProduto());
		}
	}

	private static void registrarVenda(Scanner scanner) {
		System.out.println("\n--- Registro de Venda ---");
		System.out.print("Nome do Produto: ");
		String nome = scanner.nextLine();
		System.out.print("Quantidade Vendida: ");
		int quantidadeVendida = scanner.nextInt();

		for (int i = 0; i < totalProdutos; i++) {
			if (produtos[i].getNome().equalsIgnoreCase(nome)) {
				try {
					produtos[i].registrarVenda(quantidadeVendida);
					System.out.println("Venda registrada com sucesso!");
					return;
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return;
				}
			}
		}
		System.out.println("Produto não encontrado.");
	}
}
