package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true"; // STRING PARA CRIAR A CONEXÃO
		final String usuario = "root"; //USUARIO DO BANCO DE DADOS
		final String senha = "root";   // SENHA DO BANCO DE DADOS
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);  //CRIANDO A CONEXÃO COM O BANCO DE DADOS
		
		Statement stmt = conexao.createStatement();  //CRIAR O BANCO DE DADOS 
		stmt.execute("CREATE DATABASE IF NOT EXISTS dados_java");  //CRIAR O BANCO DE DADOS 
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}

}