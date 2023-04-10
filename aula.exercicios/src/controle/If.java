package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Muito bem!!!");
		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}
