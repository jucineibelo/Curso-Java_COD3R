package padroes.observer;

public class Namorada implements ObservadorChegaAniversariante{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar ao convidados....");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("Surpresa....");
	}

	
}
