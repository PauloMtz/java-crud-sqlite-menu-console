package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSqlite {

	public Connection getConexao() throws ClassNotFoundException {
		Connection con = null;
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:dados/dbInfo.db");
			//System.out.println("Conectado...");
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		return con;
	}
}
