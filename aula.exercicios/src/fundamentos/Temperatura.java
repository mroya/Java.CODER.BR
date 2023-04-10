package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF -32) x 5/9 = ºC
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		double fahrenheit = 95.5;
		double celsius = (fahrenheit - ajuste)*fator;
		
		System.out.println("A temperatura de " + fahrenheit + "ºF" + "em Celsius é de " + celsius + "ºC");
		
		fahrenheit = 15;
		celsius = (fahrenheit - ajuste)*fator;
		System.out.println("A temperatura de " + fahrenheit + "ºF" + "em Celsius é de " + celsius + "ºC");
	}
	
}
