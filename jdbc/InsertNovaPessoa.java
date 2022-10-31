package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertNovaPessoa {

	public static void main(String[] args)  throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.next();
		System.out.println(nome);
		
		Connection conexao = FabricaConexao.getConexao();
		
		// String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')";   DESSA FORMA É INSEGURO ALGUEM PODE CONTINUAR O SCRIPT E DELETAR DADOS POR EXEMPLO
		
		 String sql = "INSERT INTO pessoas (nome) VALUES (?)";   //FORMA SEGURA
		 PreparedStatement stmt = conexao.prepareStatement(sql); //FORMA SEGURA
		 stmt.setString(1, nome);                                //FORMA SEGURA
		
		 stmt.execute();
		 
		 System.out.println("Pessoa incluida com sucesso!");
		 
		entrada.close();
	}

}
