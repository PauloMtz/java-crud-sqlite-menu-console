package controller;

import java.sql.SQLException;
import java.util.List;
//import java.util.Locale;
import java.util.Scanner;

import dao.ProdutoDao;
import dominio.Produto;

public class ProdutoController {
	
	ProdutoDao pd = new ProdutoDao();
	Produto p = new Produto();

	Scanner scanner = new Scanner(System.in);
	//Locale usLocale = Locale.US;
	
	public void insereProduto() {
		System.out.println("--------------------------------");
		System.out.println("Produto: ");
		String produto = scanner.nextLine();
		
		System.out.println("--------------------------------");
		System.out.println("Preco: ");
		double preco = scanner.nextDouble();
		
		System.out.println("--------------------------------");
		System.out.println("Estoque: ");
		int estoque = scanner.nextInt();
		
		p.setProduto(produto);
		p.setPreco(preco);
		p.setEstoque(estoque);
		
		pd.inserir(p);
	}
	
	public void listarProdutos() {
		List<Produto> lista = pd.listar();

		if (!lista.isEmpty()) {
			System.out.println("\n--------------------------------");
			System.out.println("Cod\tProduto\tPreço\tEstoque");
			System.out.println("--------------------------------");
			for(Produto p : lista) {
				System.out.println(p.getId() + "\t" 
						+ p.getProduto() + "\t" 
						+ p.getPreco() + "\t"
						+ p.getEstoque());
			}
			System.out.println("--------------------------------");
			
			// artifício para pausar a exibição da lista
			for(int i = 0; i <= 1; i++) {
				System.out.println("Pressione enter para continuar... ");
				scanner.nextLine();
			}
		} else {
			System.out.println("Lista vazia");
		}
	}
	
	public void alteraProduto() throws SQLException {
		System.out.println("\n--------------------------------");
		System.out.print("Informe Id do produto: ");
		p = pd.buscaPorId(scanner.nextInt());
		if(p != null) {
			System.out.println("--------------------------------");
			System.out.println("Produto: ");
			String produto = scanner.next();
			
			System.out.println("--------------------------------");
			System.out.println("Preco: ");
			double preco = scanner.nextDouble();
			
			System.out.println("--------------------------------");
			System.out.println("Estoque: ");
			int estoque = scanner.nextInt();
			
			p.setProduto(produto);
			p.setPreco(preco);
			p.setEstoque(estoque);

			pd.alterar(p);
		} else {
			System.out.println("Id inexistente.");
		}
	}
	
	public void excluiProduto() {
		System.out.println("\n--------------------------------");
		System.out.print("Informe Id do produto: ");
		p = pd.buscaPorId(scanner.nextInt());
		if(p != null) {
			pd.excluir(p);
		} else {
			System.out.println("Id inexistente.");
		}
	}
}
