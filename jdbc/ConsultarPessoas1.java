package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args)  throws SQLException{

		Connection conexao = FabricaConexao.getConexao(); // Criar a conexão
		String sql = "SELECT * FROM pessoas"; // Fazer o select atravez do parametro
		
		Statement stmt = conexao.createStatement();   // Comando que vai ser interpretado pelo SGBD
		ResultSet resultado = stmt.executeQuery(sql);  // Colocar as informações no banco de dados e mostrar atravez do ResultSet
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + "==> "+ p.getNome());
		}
		
		stmt.close();
		conexao.close();

	}

}
