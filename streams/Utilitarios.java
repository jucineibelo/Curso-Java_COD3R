package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraletra = n -> n.charAt(0) + "";
	
	public final static String grito ( String n) {
		return n + "!!!!";
	}
	

}
