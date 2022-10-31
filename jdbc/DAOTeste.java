package jdbc;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Jucinei Belo"));
		System.out.println(dao.incluir(sql, "Joana"));
		System.out.println(dao.incluir(sql, "Cristiano"));
		System.out.println(dao.incluir(sql, "Eduarda"));
		
		dao.close();
	}

}
