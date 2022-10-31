package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		
		Connection conexao = FabricaConexao.getConexao(); // Criar a conexão
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?"; // Fazer o select atravez do parametro

		System.out.println("Informr o nome que deseja pesquisar: ");
		String pesquisaNome = entrada.next();
		

		PreparedStatement stmt = conexao.prepareStatement(sql); // Comando que vai ser interpretado pelo SGBD
		stmt.setString(1, "%" + pesquisaNome + "%");
		ResultSet resultado = stmt.executeQuery(); // Colocar as informações no banco de dados e mostrar atravez do
													// ResultSet

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + "==> " + p.getNome());
		}

		stmt.close();
		conexao.close();
		entrada.close();

	}

}