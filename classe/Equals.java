package classe;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Jucinei Belo";
		u1.email = "jucineibelo@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jucinei Belo";
		u2.email = "jucineibelo@gmail.com";
		
		Usuario u3 = new Usuario();
		u3.nome = "Jucinei Belo";
		u3.email = "jucineibelo@gmail.com";
		
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		System.out.println(u2.equals(u3));

		

	}

}
