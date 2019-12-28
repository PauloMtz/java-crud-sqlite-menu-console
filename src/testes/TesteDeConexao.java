package testes;

import conexao.ConexaoSqlite;

public class TesteDeConexao {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ConexaoSqlite con = new ConexaoSqlite();
		con.getConexao();
	}

}
