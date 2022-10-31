package excecao;

public class Basico {

	public static void main(String[] args) {

		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Erro de divisão por zero"+ e.getMessage());
		}
		
		
		
		

		
	}

}
