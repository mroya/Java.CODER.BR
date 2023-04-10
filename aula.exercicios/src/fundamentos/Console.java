package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.printf("MegaSena: %d %d %d %d %d %d \n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.2f \n\n", 1234.5678);

		//Uso do Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Informe seu nome: ");
		
		String nome = entrada.nextLine();
		
		System.out.println("Sua idade é " + idade + " Seja bem vindo " + nome);
		
		entrada.close();
		
	}
}
