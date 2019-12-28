package dominio;

public class Produto {

	private int id;
	private String produto;
	private double preco;
	private int estoque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void diminuirEstoque(int qtde) {
		if (qtde > estoque)
			System.out.println("Estoque menor que o solicitado.\n");
		else
			this.estoque -= qtde;
	}

	public void aumentarEstoque(int qtde) {
		if (qtde < 0)
			System.out.println("Quantidade inválida.\n");
		else
			this.estoque += qtde;
	}

	public void imprimir() {
		System.out.println("Nome\t\tPreço\tEstoque\n" + produto + "\t" + preco + "\t" + estoque + "\n");
	}
}
