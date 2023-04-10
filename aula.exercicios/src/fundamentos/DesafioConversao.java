package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o 1º valor: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o 2º valor: ");
		String valor2 = entrada.nextLine().replace(",", ".");;
		
		System.out.println("Informe o 3º valor: ");
		String valor3 = entrada.nextLine().replace(",", ".");;
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);

		double soma = (num1+num2+num3);
		double media = soma/ 3;
		
		System.out.println("A soma dos números é " + soma);
		System.out.println("A média dos números é " + media);
		
		
		entrada.close();
	}
}
