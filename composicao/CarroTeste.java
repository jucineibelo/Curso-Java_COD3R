package composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro car = new Carro();

		System.out.println(car.estaligado());

		car.ligar();
		car.acelerar();
		car.acelerar();
		car.acelerar();

		System.out.println(car.motor.giros());
		
		car.frear();
		
		System.out.println(car.motor.giros());

	}

}
