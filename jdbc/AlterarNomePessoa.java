package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();

		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ? ";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ? ";

		Connection conexao = FabricaConexao.getConexao(); // CRIAR CONEXÃO
		PreparedStatement stmt = conexao.prepareStatement(select); // COMANDO A SER INTERPRETADO PELO BANCO DE DADOS
		stmt.setInt(1, codigo); // APENAS 1 PARAMETRO CÓDIGO
		ResultSet resultado = stmt.executeQuery(); // COLOCAR AS INFORMAÇÕES NO BANCO DE DADOS E MOSTRAR ATRAVEZ DO
													// RESULSET

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();

			System.out.println("Informe o novo nome:");
			String novoNome = entrada.nextLine();

			stmt.close();
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();

			System.out.println("Pessoa alteraada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");

		}

		conexao.close();
		entrada.close();
	}

}
