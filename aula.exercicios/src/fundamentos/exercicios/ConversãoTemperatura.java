package fundamentos.exercicios;

import java.util.Scanner;

public class ConversãoTemperatura {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// (ºF -32) x 5/9 = ºC
		double ajuste = 32;
		double fator = 5.0 / 9.0;
		double fatorCelsius = 1.8;
		
		System.out.print("Converter:\n(1)Celsius Cº ou (2)Fahrenheit Fº:\n");
		String tipoTemperatura = entrada.nextLine();
		System.out.print("Informe a temperatura: ");
		double temperatura = entrada.nextDouble();
		
		double resultado = "1".equals(tipoTemperatura) ? (temperatura - ajuste)*fator : 0;
		resultado = "2".equals(tipoTemperatura) ? (temperatura * fatorCelsius) + fator : resultado;
		
		String tipoTemp = "1" != null ? "Celsius" : "0"; 
		tipoTemp = "2" != null ? "fahrenheit" : "resultado";
		
		System.out.printf("A temperatura de %.2f para %s é %.2f", temperatura, tipoTemp , resultado);		
		
		entrada.close();
	}
	
}
