package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o 1º número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Informe o 2º número: ");
		double num2 = entrada.nextDouble();
		System.out.println("Qual tipo de conta você gostaria de fazer?");
		String escolha = entrada.next();
		
		double resultado = "+".equals(escolha) ? num1 + num2 : 0;
		resultado = "-".equals(escolha) ? num1 - num2 : resultado;
		resultado = "*".equals(escolha) ? num1 * num2 : resultado;
		resultado = "/".equals(escolha) ? num1 / num2 : resultado;
		resultado = "%".equals(escolha) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, escolha , num2, resultado);
			
		
		entrada.close();
	}
}
