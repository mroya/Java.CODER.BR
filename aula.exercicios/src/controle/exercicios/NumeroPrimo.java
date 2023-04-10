/**
 * Criar um programa que receba um número e diga se ele é um número primo.
 * @author Marcio.Roya
 * @version 1.0
 *
 */
package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Verificar de número Primo: ");
		int num = entrada.nextInt();
		
		for (int i = 2; i < num;) {
			if(num % i == 0) {
				System.out.println("Este número não é primo");
				break;
			} else {
				System.out.println("Número Primo.");
				break;
			}
		}
		
		entrada.close();

	}

}
