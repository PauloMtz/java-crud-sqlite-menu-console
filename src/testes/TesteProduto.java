package testes;

import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDao;
import dominio.Produto;

public class TesteProduto {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ProdutoDao pd = new ProdutoDao();
		
		//---------------------------------------
		// inserir dados
		//---------------------------------------
		
		/*
		Produto p = new Produto();
		p.setProduto("Teste II");
		p.setPreco(6.3);
		p.setEstoque(90);
		
		try {
			pd.inserir(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/
		
		//---------------------------------------
		// listar dados
		//---------------------------------------
		
		
		List<Produto> produtos = pd.listar();
		
		System.out.println("\n--------------------------------");
		System.out.println("Cod\tProduto\tPreço\tEstoque");
		System.out.println("--------------------------------");
		for(Produto p : produtos) {
			System.out.println(p.getId() + "\t" 
					+ p.getProduto() + "\t" 
					+ p.getPreco() + "\t"
					+ p.getEstoque());
		}
		System.out.println("--------------------------------");
		
		
		/* Resultado no console
		    --------------------------------
			Cod		Produto	Preço	Estoque
			--------------------------------
			1002	Massa	2.95	25
			1003	Arroz	4.55	20
			1004	Feijão	6.3		40
			1005	Farinha	3.25	33
			1008	Sabão	4.25	42
			-------------------------------- 
		 */
		
		
		
		//---------------------------------------
		// alterar dados
		//---------------------------------------
		
		/*
		Produto p = pd.buscaPorId(1008);
		p.setProduto("Sabão");
		p.setPreco(4.25);
		p.setEstoque(42);
		pd.alterar(p);
		*/
		
		//---------------------------------------
		// alterar dados
		//---------------------------------------
		
		/*
		Produto p = pd.buscaPorId(1007);
		pd.excluir(p);
		*/
	}

}
