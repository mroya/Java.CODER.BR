package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObeservador(namorada);
		
		//porteiro.registrarObeservador(e -> System.out.println("Surpresa via lambda"));
		porteiro.monitorar();
	
	}
}
