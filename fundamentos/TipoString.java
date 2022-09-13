package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		String s = "Good night";
		System.out.println(s);
		
		var nome = "Jucinei";
		var sobrenome = "Belo";
		var idade = 32;
		var salario = 10000.596;
		
		System.out.println("Nome:" + nome + "\nSobrenome:" +sobrenome + "\nidade:" + idade + "\nsalario:" + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha RS: %.1f.", nome, sobrenome, idade, salario);

	}

}