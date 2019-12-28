package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConexaoSqlite;
import dominio.Produto;

public class ProdutoDao {
	
	private Connection con;

	public ProdutoDao() {
		try {
			this.con = new ConexaoSqlite().getConexao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void inserir(Produto p) {

		String sql = "INSERT INTO produtos (produto, preco, estoque) VALUES (?, ?, ?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, p.getProduto());
			stm.setDouble(2, p.getPreco());
			stm.setInt(3, p.getEstoque());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Produto> listar() {

		try {
			List<Produto> produtos = new ArrayList<Produto>();
			String sql = "SELECT * FROM produtos";
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setProduto(rs.getString("produto"));
				p.setPreco(rs.getDouble("preco"));
				p.setEstoque(rs.getInt("estoque"));

				produtos.add(p);
			}

			rs.close();
			stm.close();
			return produtos;

		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
	
	public void alterar(Produto p) throws SQLException {

		String sql = "UPDATE produtos SET produto = ?, preco = ?, estoque = ? WHERE id = ?";
		PreparedStatement stm = null;

		try {
			stm = con.prepareStatement(sql);
			stm.setString(1, p.getProduto());
			stm.setDouble(2, p.getPreco());
			stm.setInt(3, p.getEstoque());
			stm.setInt(4, p.getId());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			stm.close();
		}
	}

	public void excluir(Produto p) {

		String sql = "DELETE FROM produtos WHERE id = ?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, p.getId());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Produto buscaPorId(int id) {

		Produto p;

		try {
			String sql = "SELECT * FROM produtos WHERE id = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();

			p = new Produto();

			while (rs.next()) {
				p.setId(rs.getInt(1));
				p.setProduto(rs.getString(2));
				p.setPreco(rs.getDouble(3));
				p.setEstoque(rs.getInt(4));
			}
			return p;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
